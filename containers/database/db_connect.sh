#!/bin/bash
. ./config.sh

mysql --verbose --protocol=tcp -h localhost -P $DB_PORT -p $DB_NAME -u $DB_USER --password 