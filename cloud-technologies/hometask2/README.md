Artur Vynokur 4CS-32

1. chmod +x start.sh userdata.sh
2. ./start.sh
3. aws ec2 describe-instances --region us-east-1 \
  --query "Reservations[*].Instances[*].[InstanceId,State.Name,PublicIpAddress]" \
  --output table
4. AWS Console → Systems Manager → Fleet Manager → інстанс → Node actions → Connect → Start session
5. cat /var/www/html/index.html
6. systemctl status crond
7. tail /var/log/cron-log.txt
