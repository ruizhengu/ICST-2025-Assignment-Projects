#!/bin/bash

#SBATCH --mem=32G
#SBATCH --time=96:00:00

module load Java/8.362
module Anaconda3/2022.05
module load Python/3.8.6-GCCcore-10.2.0

python -m cream.incremental_repair.intermediate $1
