Artur Vynokur 4CS-32

1. Запуск EC2 з user-data
bash
./run-instance.sh

2. підключення до EC2 по SSH: ssh -i UbuntuKey.pem ec2-user@<EC2_PUBLIC_IP>
3. перевірка статусу сервісу (systemd): systemctl status httpd
4. перевірка відкритих портів і процесів: sudo ss -tulpn | grep httpd
5. перевірка HTTP-заголовків (HEAD request): curl -I http://<EC2_PUBLIC_IP>
6. перевірка HTTPS-зʼєднання: curl -k https://<EC2_PUBLIC_IP>

Після запуску EC2 AWS автоматично виконує user-data, який встановлює Apache, 
генерує TLS-сертифікат, налаштовує HTTP→HTTPS редирект
і після цього я перевіряю доступність сервісу та портів цими командами.


