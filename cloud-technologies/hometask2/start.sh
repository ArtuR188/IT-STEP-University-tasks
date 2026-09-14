#!/bin/bash
set -e

aws ec2 run-instances \
  --region us-east-1 \
  --image-id ami-0c02fb55956c7d316 \
  --instance-type t3.micro \
  --key-name UbuntuKey \
  --iam-instance-profile Name="SSMRole" \
  --user-data file://userdata.sh \
  --tag-specifications 'ResourceType=instance,Tags=[{Key=Name,Value=Artur-Hometask2}]'
