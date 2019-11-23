#!/bin/sh
Class = cloud-zuul.jar

ppid=`pgrep -f ${Class} | wc -l`
if [ $ppid == 0 ]; then
    echo "parent pid not found , ${Class} is already stopped !"
    else
    pgrep -f ${Class} | while read cpid
    do
        echo "kill pid : $cpid";
        kill -15 $cpid ;
    done
    echo "${Class} is stopped !"
fi