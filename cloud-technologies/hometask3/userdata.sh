#!/bin/bash

yum install -y cronie amazon-ssm-agent
systemctl enable crond
systemctl start crond
systemctl enable amazon-ssm-agent
systemctl start amazon-ssm-agent

cat << 'EOF' > /root/sysinfo.sh
#!/bin/bash
echo "CRON RAN at $(date)" >> /var/log/sysinfo
LOGFILE="/var/log/sysinfo"
{
echo "---- $(date) ----"
echo "UPTIME and USERS:"
/usr/bin/w
echo "MEMORY:"
/usr/bin/free -m
echo "DISK:"
/usr/bin/df -h
echo "OPEN TCP PORTS:"
/usr/sbin/ss -tlpn
echo "PING ukr.net:"
/usr/bin/ping -c1 -w1 ukr.net
echo "SUID FILES:"
/usr/bin/find / -perm -4000 -type f 2>/dev/null
} >> $LOGFILE
EOF

chmod +x /root/sysinfo.sh

cat << 'EOF' > /etc/crontab
SHELL=/bin/bash
PATH=/sbin:/bin:/usr/sbin:/usr/bin
* * * * * root /root/sysinfo.sh
EOF

systemctl restart crond
