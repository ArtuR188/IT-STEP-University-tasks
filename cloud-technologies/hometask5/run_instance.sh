#!/bin/bash

aws ec2 run-instances \
  --image-id ami-053b0d53c279acc90 \
  --instance-type t3.micro \
  --count 1 \
  --key-name UbuntuKey \
  --security-group-ids sg-09819dbbf1462fa19 \
  --region us-east-1 \
  --user-data file://userdata.sh
