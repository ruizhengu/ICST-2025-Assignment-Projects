#!/bin/bash

#SBATCH --mem=16G

module load Java/8.362
module load Anaconda3/2022.10
#conda init bash
#conda activate APR-as-AAT

python /mnt/parscratch/users/acp22rg/APR-as-AAT/APR-as-AAT/repair-generation/partial_repair_cafe.py
