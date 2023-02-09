#!/usr/bin bash

javac $(find src -name "*.java") -d bin/
jar cvfe Send-Stuff-Java.jar Main -C bin .