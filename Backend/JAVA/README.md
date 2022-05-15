## JAVA
 
 Para realizar una parte del web, se decidió hacer un formato separado para los usuarios que requieran registarse para solicitar un dron dentro del juego.

El propósito de hacerlo separado de la página principal, fue el hecho de que solamente se trataría de registros, además de poder utilizar otra implementación de Java.

Se creó un Proyecto JSP, que incluye una implementación con Docker. Es necesario contar con el Software de Docker porque permite no tener dependencias en especificaciones , máquinas virtuales, u otras configuraciones necesarias para correr el proyecto.

Una vez generado el archivo .WAR del proyecto, es necesario usar el comando docker-compose up para inicializar el proceso con docker.

![Captura de pantalla 2022-05-15 173411](https://user-images.githubusercontent.com/70116251/168497025-03794cec-f26c-46ae-bf88-da35199092ac.png)

Al finalizar se requiere ingresar a : http://localhost:8080/DroneForm-1.0-SNAPSHOT/ y se puede ver el Formulario funcionando. Como se muestra a continuación: 

![JavaRun](https://user-images.githubusercontent.com/70116251/168497344-976417f0-d0b5-459f-ad52-1650c36e4bbf.gif)

La aplicación consiste en un formulario con HTML y CSS. Los datos son validados con una expresión regular y si se completa correctamente, la página manda un mensaje de éxito.  

Los datos para acceder a la base de datos son: 

Comando docker:  docker exec -it droneform_app-db_1 mysql -uroot -p

Base de datos: myDb

user: root

password: password


![db](https://user-images.githubusercontent.com/70116251/168497440-45d68438-b274-4e0f-9712-4b5a2a499eed.png)

![db2](https://user-images.githubusercontent.com/70116251/168497444-2dd6b203-a9b5-4f5c-9c0c-864523dd5c1c.png)

Para acceder a la aplicación: http://localhost:8080/DroneForm-1.0-SNAPSHOT/

*NOTA: por problemas con la cuenta de azure, no se pudo implementar en Web  la aplicación.

Los archivos en este repositorio contienen todo el proyecto realizado en IntelliJ Ultimate.



- [IR A FRONTEND](../../Frontend/README.md)
- [IR A BACKEND](../../Backend/README.md)
- [IR AL ANALISIS DE DATOS](../../AnalisisDatos/README.md)
- [REGREASAR A REPOSITORIO PRINCIPAL](../../README.md)
