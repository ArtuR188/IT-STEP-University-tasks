Artur Vynokur 4CS-32  


1. Перевіряю, що інстанс працює:
aws ec2 describe-instances \
  --query "Reservations[].Instances[?State.Name=='running'].InstanceId" \
  --output text --region us-east-1



3. Перевіряю публічну IP адресу:
  aws ec2 describe-instances \
  --instance-ids i-0db0ddcc4bcd5b339 \
  --query "Reservations[0].Instances[0].PublicIpAddress" \
  --output text --region us-east-1

  якщо ні, то запущу: ./ec2-config

 3. SSH з динамічним форвардингом:  ssh -i UbuntuKey.pem -D 1080 ubuntu@ip

4. локальний веб-сервер  
у Powershell: py -m http.server 8000

5. Reverse tunnel (новий):
 ssh -i UbuntuKey.pem -R 9000:localhost:8000 ubuntu@ip

6. Перевірка що тунель працює:
curl http://localhost:9000

7. Перевірка GatewayPorts (user-data):
grep GatewayPorts /etc/ssh/sshd_config

8. Перевірка статусу ssh:
sudo systemctl status ssh












Опис SSH-команд, використаних у пунктах 2, 5 та 6
2. Команда: SSH з динамічним проксі-форвардингом (-D): ssh -i UbuntuKey.pem -D 1080 ubuntu@<PUBLIC_IP>
Ця команда створює SOCKS5-проксі на локальному комп’ютері на порту 1080.
Через цей проксі увесь веб-трафік браузера перенаправляється на EC2-інстанс.
SSH з ключем UbuntuKey.pem встановлює захищене з’єднання з сервером.

5. Команда: SSH з reverse-tunneling (-R): ssh -i UbuntuKey.pem -R 9000:localhost:8000 ubuntu@<PUBLIC_IP>
Опція -R відкриває порт 9000 на EC2-сервері та перенаправляє його на локальний порт 8000 на ноутбуці.

6. Внутрішня перевірка роботи тунелю (на EC2): curl http://localhost:9000









