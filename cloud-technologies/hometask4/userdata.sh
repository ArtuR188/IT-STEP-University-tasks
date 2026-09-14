#!/bin/bash
set -e

ADMINUSER="adminuser"
POWERUSER="poweruser"

ADMIN_HASH='$6$coP/rg7pQUo2usn2$rEaa/TSjvo.JDAZwks8grhqQrIgN8LBjixVuEpFfCvuMy4LE0pqFpoHT7fR2X7cZ/AesTgT1VuFZ/KfvuA1Se/'

apt update -y

useradd -m -s /bin/bash -p "$ADMIN_HASH" "$ADMINUSER"
usermod -aG sudo "$ADMINUSER"

useradd -m -s /bin/bash "$POWERUSER"
passwd -d "$POWERUSER"

echo "$POWERUSER ALL=(root) NOPASSWD: /usr/sbin/iptables" > /etc/sudoers.d/poweruser
chmod 440 /etc/sudoers.d/poweruser

usermod -aG "$ADMINUSER" "$POWERUSER"

chmod 750 "/home/$ADMINUSER"

ln -s /etc/mtab "/home/$POWERUSER/mtab-link"

