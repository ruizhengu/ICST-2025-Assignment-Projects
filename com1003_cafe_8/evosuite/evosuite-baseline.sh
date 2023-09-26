#!/usr/bin/env bash

file_classes=/home/ruizhen/Projects/APR-as-AAT/test-augmentation/classes.txt

dir_output=/home/ruizhen/Projects/APR-as-AAT/test-augmentation/evosuite-baseline

project_cp=/home/ruizhen/Projects/APR-as-AAT/com1003_cafe_8/build/classes/java/main

exec_cmd() {
    local cmd=$1

    echo
    echo "Executing command:"
    echo "$cmd"

    if $cmd; then
        echo "OK"
        return 0
    else
        echo "FAILED"
        return 1
    fi
}

for class in $(cat $file_classes); do
        cmd="$EVOSUITE \
        -class $class \
        -projectCP $project_cp:$tests_cp \
        -Dtest_dir=$dir_output"

        if ! exec_cmd "$cmd"; then
            exit 1
        fi
done