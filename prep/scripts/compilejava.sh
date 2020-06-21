#!/bin/bash

filepath="$1"

javac -sourcepath src "$filepath" -d build