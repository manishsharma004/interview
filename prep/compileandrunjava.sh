#!/bin/bash

filepath="$1"
classpath="$(grep 'package' "$filepath" | sed 's/package //g' | sed 's/;\| //g').$(basename "$filepath" | sed 's/.java//g')"

# echo $filepath
# echo $classpath
sh compilejava.sh "${filepath}" && sh runjava.sh "${classpath}"