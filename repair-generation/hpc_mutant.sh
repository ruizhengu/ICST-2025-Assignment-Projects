#!/bin/bash

#SBATCH --mem=32G
#SBATCH --time=96:00:00

module load Java/8.362
module load Anaconda3/2022.10
#conda init bash
#conda activate APR-as-AAT

python /mnt/parscratch/users/acp22rg/APR-as-AAT/APR-as-AAT/repair-generation/mutation/partial_repair_mutant.py
