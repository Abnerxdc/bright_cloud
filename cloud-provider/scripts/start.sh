#!/bin/sh
nohup java -jar cloud-provider.jar -Xms100M -Xmx500M >/dev/null 2>&1 &