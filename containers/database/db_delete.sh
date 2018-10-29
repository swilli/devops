#!/bin/bash
. ./config.sh

sudo docker stop $CONTAINER_NAME && sudo docker rm $CONTAINER_NAME


