#!/usr/bin/python

import math
import sys
import os
import re
import random


# Path to this script
SRC=os.path.dirname(sys.argv[0])

if len(sys.argv) != 7:
	print ("Usage:\n<nameOfScript>.py <dir> <minSeed> <maxSeed> <classFile> <maxJobs> <cores>")
	exit(1)

FASTDATA="/mnt/parscratch/users/acp22rg"
# How to run EvoSuite
EVOSUITE="java -Xmx400M -jar %s/evosuite/evosuite-master-1.2.1-SNAPSHOT.jar" % FASTDATA


# Location of SF100
CASESTUDY_DIR="%s/SF110" % FASTDATA


BASEDIR = os.path.abspath(sys.argv[1])

if not os.path.isdir(BASEDIR):
	print ("creating folder: " + BASEDIR)
	os.makedirs(BASEDIR)
else:
	print ("target folder already exists")
	exit(1)	

# Where to put stuff (default in subdirs of BASEDIR)
REPORTS="%s/reports" % BASEDIR
SCRIPTDIR="%s/scripts" % BASEDIR
LOGDIR="%s/logs" % BASEDIR
os.makedirs(REPORTS)
os.makedirs(SCRIPTDIR)
os.makedirs(LOGDIR)


# Initialize DB of target classes
CLASSES_FILE=sys.argv[4]
if not os.path.isfile(CLASSES_FILE):
	print ("Could not find class file " + sys.argv[4])
	exit(1)
   
CLASSES = []
f = open(CLASSES_FILE)
header = True
for line in f:
	if header:
		header = False
	else:
		entry = line.rstrip().split(',')
		CLASSES.append(entry)
f.close()
NUM_CLASSES=len(CLASSES)
print(str(NUM_CLASSES) + " classes in input file")

CORES = int(sys.argv[6])

if CORES <= 0 :
	print ("Wrong number of cores")
	exit(1)

# Global counter of jobs created
JOB_ID=0
CALL_ID=0
CONFIG_ID=0



# Creates a single call to EvoSuite
def getEvoSuiteCall(seed, configId, config, project, clazz, id, strategy, coreIndex, nTests):
  global SCRIPTDIR
  global CASESTUDY_DIR
  global JOB_ID
  global EVOSUITE
  global REPORTS
  global FIXED
  global CALL_ID
  global CORES

  logfile = "%s/%d_%s_%s_%s" % (LOGDIR, JOB_ID, configId, seed, project)
  reportfile="%s/%d/c%d" % (REPORTS, id, coreIndex)

  
  result = "pushd . > /dev/null 2>&1 \n"
  result += "cd %s/%s\n" % (CASESTUDY_DIR, project)
  
  
  result += ""+EVOSUITE+" "+strategy+" "+ str(nTests) +" -class "+ clazz +" -seed "+str(seed)
  result += " -Dconfiguration_id="+configId+ " -Dgroup_id="+project
  result += " "+config+" "+FIXED
  result += " -Dreport_dir="+reportfile
  # result += " 2>&1 | tee -a "+logfile
  #if clazz != "de.huxhorn.lilith.log4j.xml.Log4jImportCallable":
  #  result += " -Djunit_check_on_separate_process=true"
#  print "clazz is" + clazz
  if CORES != 1 :
    result += " & "
    
  result += "\n"
    
  result += "popd > /dev/null 2>&1 \n\n"
  CALL_ID += 1
  return result


# Creates the scripts for a given config and seed range
def createJobs(minSeed, maxSeed, configId, config, strategy):
  global SCRIPTDIR
  global CASESTUDY_DIR
  global JOB_ID
  global CONFIG_ID

  script=open("%s/EvoSuite_%d_%s_%d.sh" %(SCRIPTDIR, JOB_ID, configId, minSeed), "w")
  script.write("#!/bin/bash\n")
  script.write("#SBATCH --time=03:00:00\n")
  script.write("#SBATCH --mem=16G\n")
  script.write("module load Java/11.0.16\n")
  script.write("export MALLOC_ARENA_MAX=2\n")
  script.write("export _JAVA_OPTIONS=''\n")
  
  num = 0
  coreIndex = 0
    
  for seed in range(minSeed, maxSeed):

    #important if cluster gives issue
    random.shuffle(CLASSES)
    
    for entry in CLASSES:
      if num >= ENTRIES_PER_JOB:
        
        if(CORES > 1):
            script.write("wait \n")
            coreIndex = 0       
        script.close()
        
        JOB_ID +=1
        num = 1
        
        script=open("%s/EvoSuite_%d_%s_%d.sh" %(SCRIPTDIR, JOB_ID, configId, seed), "w")
        script.write("#!/bin/bash\n")
        script.write("#SBATCH --time=03:00:00\n")
        script.write("#SBATCH --mem=16G\n")
        script.write("module load Java/11.0.16\n")
        script.write("export MALLOC_ARENA_MAX=2\n")
        script.write("export _JAVA_OPTIONS=''\n")
      else:
        num += 1

      script.write(getEvoSuiteCall(seed, "bound", config, entry[0], entry[1], JOB_ID, strategy, coreIndex, entry[3]))
      num += 1
      script.write(getEvoSuiteCall(seed, "under", config, entry[0], entry[1], JOB_ID, strategy, coreIndex, int(entry[3])//2))
      num += 1
      script.write(getEvoSuiteCall(seed, "over", config, entry[0], entry[1], JOB_ID, strategy, coreIndex, int(entry[3])*2))
      if(CORES > 1):
        coreIndex += 1

      if(CORES > 1  and coreIndex == CORES): 
        script.write("\n\n wait \n\n")
        coreIndex = 0 

  if(CORES > 1):
    script.write("wait \n")  
  script.close()
  
  JOB_ID += 1
  CONFIG_ID += 1

  return

# Fixed set of parameters to use in all jobs
FIXED = " -Dinline=false  -mem 5000 -Dplot=false  -Dshow_progress=false  \
          -Dminimize=false -Dassertions=false  -Denable_asserts_for_evosuite=true  \
          -Dnew_statistics=true -Dmax_int=2147483646 -Dprimitive_pool=0.0 -Dseed_types=false  \
          -Dtest_archive=false -Dtest_factory=random -Dcoverage_matrix=true  \
          -Dsave_all_data=false -Dtest_comments=false -criterion LINE:BRANCH:WEAKMUTATION -Dconsider_main_methods=true  \
          -Djunit_tests=false -Djunit_check=false -Dpure_inspectors=false -Dcall_probability=0.1  \
          -Dinitialization_timeout=240 -Dsearch_budget=240 -Dglobal_timeout=240 -Dminimization_timeout=240 -Dassertion_timeout=1200 -Dextra_timeout=240 \
          -Doutput_variables=\"configuration_id,group_id,TARGET_CLASS,random_seed,Coverage,Total_Goals,Covered_Goals,Lines,Covered_Lines,LineCoverage,Mutants,WeakMutationScore,Size,Result_Size,Length,Result_Length,Total_Methods,Covered_Methods,Branchless_Methods,Covered_Branchless_Methods,Total_Branches,Covered_Branches,Statements_Executed,Tests_Executed\" \
          " 

MINSEED = int(sys.argv[2])
MAXSEED = int(sys.argv[3])

MAX_JOBS = int(sys.argv[5])


# How many calls to EvoSuite should go in one script
N_CONF = 1  #(depends on number of configurations)
ENTRIES_PER_JOB= round( (N_CONF * (NUM_CLASSES * (MAXSEED - MINSEED)) / (MAX_JOBS - N_CONF)) + 1 ) 



# Create the actual jobs

createJobs(MINSEED, MAXSEED, "random", " -Dreplace_calls=true -Dreplace_system_in=true -Dvirtual_fs=true  -Dhandle_static_fields=true -Dreset_static_fields=true ", "-generateNumRandom")



print ("Seeds: %d, projects: %d, configs: %d" % ((MAXSEED - MINSEED), NUM_CLASSES, CONFIG_ID))
print ("Total number of jobs created: %d" % JOB_ID)
print ("Total number of calls to EvoSuite: %d" % CALL_ID)
print ("Calls per job: %d" % ENTRIES_PER_JOB)

