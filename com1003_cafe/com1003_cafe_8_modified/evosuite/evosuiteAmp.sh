#!/usr/bin/env bash

file_classes=/home/ruizhen/Projects/APR-as-AAT/test-augmentation/classes.txt
file_test_classes=/home/ruizhen/Projects/APR-as-AAT/test-augmentation/test-classes.txt

dir_output=/home/ruizhen/Projects/APR-as-AAT/test-augmentation/EvoAmp

testGen_bin=/home/ruizhen/Projects/test-amplification/defects4j/framework/lib/test_generation/bin
testGen_lib=/home/ruizhen/Projects/test-amplification/defects4j/framework/lib/test_generation/generation

project_cp=/home/ruizhen/Projects/APR-as-AAT/com1003_cafe_8/build/classes/java/main
tests_cp=/home/ruizhen/Projects/APR-as-AAT/com1003_cafe_8/build/classes/java/test

seed=711
total_budget=120

parse_config() {
    local file=$1
    grep -v "\s*#" $file | tr '\n' ' '
}

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

add_config=$(parse_config $testGen_bin/evosuite.config)

num_classes=$(cat $file_classes | wc -l)
budget=$(echo "$total_budget/2/$num_classes" | bc)
for class in $(cat $file_classes); do
    for test in $(cat $file_test_classes); do
        cmd="java -cp $testGen_lib/evosuite-master-1.2.1-SNAPSHOT.jar org.evosuite.EvoSuite \
        -class $class \
        -projectCP $project_cp:$tests_cp \
        -seed $seed \
        -Djunit=$test \
        -Dselected_junit=$test \
        -Dsearch_budget=$budget \
        -Dassertion_timeout=$budget \
        -Dtest_dir=$dir_output \
        $add_config"

        if ! exec_cmd "$cmd"; then
            exit 1
        fi
    done
done