#!/bin/bash

#SBATCH --mem=16G

module load Java/11.0.16
module load Anaconda3/2022.10
conda activate APR-as-AAT

python /mnt/parscratch/users/acp22rg/APR-as-AAT/APR-as-AAT/repair-generation/repair_cafe.py