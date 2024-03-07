#!/bin/bash

#SBATCH --mem=64G
#SBATCH --time=96:00:00

module load Java/8.362
module Anaconda3/2022.05
#conda init bash
#conda activate APR-as-AAT

export PYTHONPATH="${PYTHONPATH}:/mnt/parscratch/users/acp22rg/APR-as-AAT/APR-as-AAT/repair-generation"

python /mnt/parscratch/users/acp22rg/APR-as-AAT/APR-as-AAT/repair-generation/cafe/repair_cafe_arja.py
