FROM fedora:latest

RUN dnf -y install nginx && dnf clean all

COPY html/ /usr/share/nginx/html/

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
