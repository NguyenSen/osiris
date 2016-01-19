#!/bin/sh
echo "*********************************************************************************************************"
echo "CLEAN AND RUN MONGODB"
echo "*********************************************************************************************************"
rm -rf /data/db/*
mongod --nojournal --fork --logpath /var/log/mongodb.log
sleep 10

echo "*********************************************************************************************************"
echo "CREATE LOG FOLDER"  
echo "*********************************************************************************************************"
mkdir ../../../../../logs
