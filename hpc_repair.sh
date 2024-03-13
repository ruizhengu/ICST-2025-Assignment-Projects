#!/bin/bash

#SBATCH --mem=64G
#SBATCH --time=96:00:00

module load Java/8.362
module Anaconda3/2022.05
module load Python/3.8.6-GCCcore-10.2.0
#conda init bash
#conda activate APR-as-AAT

#export PYTHONPATH="${PYTHONPATH}:/mnt/parscratch/users/acp22rg/APR-as-AAT/APR4Grade/cream-generation"

python -m cream.assignment.repair
