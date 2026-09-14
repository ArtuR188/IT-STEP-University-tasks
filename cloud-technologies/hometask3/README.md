Artur Vynokur 4CS-32

1. chmod 400 UbuntuKey.pem
2. ./create_vm.sh
3. ssh -i UbuntuKey.pem ec2-user@PUBLIC_IP
4. systemctl status crond
5. sudo tail -20 /var/log/sysinfo
6. sudo grep "CRON RAN" /var/log/sysinfo
