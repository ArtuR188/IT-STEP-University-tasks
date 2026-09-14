Artur Vynokur 4CS-32 

1. ./run-instance.sh
2. Підключаємося SSH і створюємо тунель: ssh -i UbuntuKey.pem -L 5566:127.0.0.1:2375 ubuntu@IP
3. Перевіряємо Docker на EC2: docker ps
4. У новому Git bash: Будуємо Docker image через тунель: docker -H localhost:5566 build -t mynginx .
5. Запускаємо контейнер nginx на EC2: docker -H localhost:5566 run -d -p 80:80 --name mynginx mynginx
6. Перевіряємо, що контейнер працює: docker -H localhost:5566 ps
7. Відкриваємо сайт у браузері: http://IP

Переглянути статус: docker -H localhost:5566 ps -a


