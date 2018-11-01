#!/bin/bash
. ./config.sh

sudo docker run --name $CONTAINER_NAME -p $DB_PORT:3306 -e MYSQL_ROOT_PASSWORD=$DB_ROOT_PASSWORD -e MYSQL_DATABASE=$DB_NAME -e MYSQL_USER=$DB_USER -e MYSQL_PASSWORD=$DB_PASSWORD -e MYSQL_ROOT_HOST=% -d mariadb

