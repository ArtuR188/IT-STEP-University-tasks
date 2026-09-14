
#!/bin/bash

yum update -y --security

yum install -y mc git vim
yum install -y httpd

systemctl enable httpd
systemctl start httpd

cat <<EOF >/var/www/html/index.html
<html>
 <head><title>Hometask 2</title></head>
 <body>
   <h1>Artur — Hometask 2</h1>
   <p>Сервер працює автоматично завдяки user-data.</p>
 </body>
</html>
EOF

yum install -y cronie
systemctl enable crond
systemctl start crond

echo "*/5 * * * * root echo 'Updated at: \$(date)' >> /var/log/cron-log.txt" >> /etc/crontab
systemctl restart crond
