import subprocess


def run_cmd(command):
    return subprocess.Popen(command, shell=True, stdout=subprocess.PIPE).stdout.read()
