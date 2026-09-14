#!/bin/bash

aws ec2 run-instances \
  --image-id ami-053b0d53c279acc90 \
  --count 1 \
  --instance-type t3.micro \
  --key-name UbuntuKey \
  --subnet-id subnet-0837944fa2a2c8124 \
  --security-group-ids sg-0b1e5987c75ca7f87 \
  --iam-instance-profile Name=EC2SSMRole \
  --user-data file://userdata.sh \
  --region us-east-1
