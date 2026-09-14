#!/bin/bash
set -euo pipefail

AMI_ID="ami-01bc990364452ab3e"
INSTANCE_TYPE="t3.micro"
KEY_NAME="UbuntuKey"
SECURITY_GROUP_ID="sg-060a0017c16b3b8bb"
SUBNET_ID="subnet-0837944fa2a2c8124"
IAM_INSTANCE_PROFILE="SSMRole"

aws ec2 run-instances \
  --image-id "$AMI_ID" \
  --instance-type "$INSTANCE_TYPE" \
  --key-name "$KEY_NAME" \
  --security-group-ids "$SECURITY_GROUP_ID" \
  --subnet-id "$SUBNET_ID" \
  --iam-instance-profile Name="$IAM_INSTANCE_PROFILE" \
  --tag-specifications 'ResourceType=instance,Tags=[{Key=Name,Value=hometask3}]' \
  --user-data file://userdata.sh
