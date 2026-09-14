Artur Vynokur 4CS-32

1. chmod 400 hometask4-key.pem
2. ssh -i hometask4-key.pem ubuntu@PUBLIC_IP

3. getent passwd adminuser poweruser
4. sudo -l -U adminuser
5. sudo -u poweruser ls -l /home/adminuser
6. sudo -u poweruser sudo -l
7. sudo -u poweruser ls -l /home/poweruser/mtab-link
