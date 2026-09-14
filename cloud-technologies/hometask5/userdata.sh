#!/bin/bash

mkdir -p /folder1 /folder2
chown ubuntu:ubuntu /folder1 /folder2

cat << 'EOF' > /move.sh
#!/bin/bash
while true; do
  mv /folder1/* /folder2/ 2>/dev/null
  sleep 2
done
EOF

chmod +x /move.sh

cat << 'EOF' > /etc/systemd/system/move.service
[Unit]
Description=Simple file mover

[Service]
ExecStart=/move.sh
Restart=always

[Install]
WantedBy=multi-user.target
EOF

systemctl daemon-reload
systemctl enable --now move.service
