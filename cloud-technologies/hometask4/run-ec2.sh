#!/bin/bash
set -e

source ./ec2config.txt

aws ec2 run-instances \
    --image-id "$AMI_ID" \
    --count 1 \
    --instance-type "$TYPE" \
    --key-name "$KEY_PAIR" \
    --security-group-ids "$SG" \
    --region "$REGION" \
    --iam-instance-profile Name="$EC2_PROFILE" \
    --user-data "$USER_DATA_PATH" \
    --tag-specifications "ResourceType=instance,Tags=[{Key=Name,Value=$TAG}]"

echo ""
echo "EC2 instance created."
