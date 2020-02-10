#!/bin/bash

fswatch -e ".git" -0 /Users/makcuzlov/lab2 | xargs -0 -n 1 bash /Users/makcuzlov/lab2/.scripts/commit-all.sh
