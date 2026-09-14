#!/bin/bash

aws ec2 run-instances \
  --region us-east-1 \
  --image-id ami-01bc990364452ab3e \
  --instance-type t3.micro \
  --key-name UbuntuKey \
  --security-group-ids sg-09897259c005c894f \
  --subnet-id subnet-0278b72f37cecf06c \
  --associate-public-ip-address \
  --user-data file://userdata.sh \
  --tag-specifications 'ResourceType=instance,Tags=[{Key=Name,Value=hometask8}]'
