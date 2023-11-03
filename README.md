![Intelix](https://i.imgur.com/Nb94sn8.png)

#Practica para capacitacion de Sofka
###Aplicación de consola

 ![Static Badge](https://img.shields.io/badge/0.0.1-version-%2300bab4) ![Static Badge](https://img.shields.io/badge/0.0.1-release-%2300bab4)


**Table of Contents**

[TOCM]

[TOC]

# Configuraciones
#### Configuración de propertie y de ambiente　

Application.yml
```
spring:
   data:
      mongodb:
         host: localhost
         port: 27017
         database: sofka
         username: ${USERMONGO}
         password: ${PASSMONGO}
         authentication-database: admin 
```

Antes de comenzar y arrancar nuestro proyecto debemos configurar dos variables de entorno en nuestro sistema operativo, las cuales deberán tener el **usuario y contraseña** de la base de datos mongo.

Adicionalmente tenemos al inicio debemos tener una **base de datos mongo llamada sofka**, la cual  debe tener la **colección sale**.

Datos de conexión  | Valores
------------- | -------------
host  | localhost
puerto | 27017
base de datos  | sofka
nombre de variable de entorno para usuario  | USERMONGO
nombre de variable de entorno para contraseña  | PASSMONGO
base de datos de autenticación | admin

###End
