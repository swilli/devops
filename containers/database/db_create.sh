#!/bin/bash
. ./config.sh

sudo docker run --name $CONTAINER_NAME -e MYSQL_ROOT_PASSWORD=T!m3tabl3R0ot -e MYSQL_DATABASE=timetable_db -e MYSQL_USER=timetable_usr -e MYSQL_PASSWORD=T!m3tabl3 -p 3306:9999 -d mariadb

