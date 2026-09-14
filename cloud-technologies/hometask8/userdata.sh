#!/bin/bash

yum install -y httpd mod_ssl openssl

systemctl enable httpd
systemctl start httpd

openssl req -x509 -nodes -days 365 \
  -newkey rsa:2048 \
  -keyout /etc/pki/tls/private/selfsigned.key \
  -out /etc/pki/tls/certs/selfsigned.crt \
  -subj "/C=UA/ST=Lviv/L=Lviv/O=ITSTEP/OU=DevOps/CN=localhost"

cat > /etc/httpd/conf.d/ssl.conf <<EOF
<VirtualHost *:443>
  DocumentRoot /var/www/html
  SSLEngine on
  SSLCertificateFile /etc/pki/tls/certs/selfsigned.crt
  SSLCertificateKeyFile /etc/pki/tls/private/selfsigned.key
</VirtualHost>
EOF

cat > /etc/httpd/conf.d/redirect.conf <<EOF
<VirtualHost *:80>
    Redirect "/" "https://localhost/"
</VirtualHost>
EOF

cat > /var/www/html/index.html <<EOF
<h1>Hometask 8</h1>
<p>Apache HTTPS + redirect works</p>
EOF

systemctl restart httpd

