#!/bin/bash

#SBATCH --mem=16G

module load Python/3.10.8-GCCcore-12.2.0
module load Java/11.0.16

python /mnt/parscratch/users/acp22rg/APR-as-AAT/APR-as-AAT/repair-generation/repair_cafe.py