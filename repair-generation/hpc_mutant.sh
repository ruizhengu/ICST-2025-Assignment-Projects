#!/bin/bash

#SBATCH --mem=32G
#SBATCH --time=96:00:00

module load Java/8.362
module load Anaconda3/2022.05
#conda init bash
#conda activate APR-as-AAT

SOURCE_DIR="/mnt/parscratch/users/acp22rg/APR-as-AAT/APR-as-AAT/resource/model_mutants"
DESTINATION_DIR="/mnt/parscratch/users/acp22rg/APR-as-AAT/model_mutants"

# Use rsync to copy the folder, replacing it if it exists
rsync -av --delete "$SOURCE_DIR/" "$DESTINATION_DIR"

export PYTHONPATH="${PYTHONPATH}:/mnt/parscratch/users/acp22rg/APR-as-AAT/APR-as-AAT/repair-generation"

python /mnt/parscratch/users/acp22rg/APR-as-AAT/APR-as-AAT/repair-generation/mutation/partial_repair_mutant.py
