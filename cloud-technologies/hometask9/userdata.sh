#!/bin/bash
set -eux

# Оновити пакети і встановити Docker
apt-get update -y
apt-get install -y docker.io

# Увімкнути Docker в автозапуску
systemctl enable docker

# Налаштувати Docker, щоб він слухав unix socket + tcp://127.0.0.1:2375
mkdir -p /etc/docker

cat > /etc/docker/daemon.json <<EOF
{
  "hosts": [
    "unix:///var/run/docker.sock",
    "tcp://127.0.0.1:2375"
  ]
}
EOF

# Перезапустити Docker з новою конфігурацією
systemctl daemon-reload
systemctl restart docker

# Додати користувача ubuntu у групу docker
usermod -aG docker ubuntu
