# springboot-application-4SAE8
### Spring boot project - class 4SAE8


( Client Controller + Stock Controller + Swagger + Lombok ...etc) 

- MVC REST - Swagger ( 11 November 2021)
- Test Unitaires + Lombok 
- Spring Data JPA JPQL (31 october 2021)
- Crud Repository (27 october 2021) 
- Spring Data JPA : Associations (20 october 2021) 
- Spring Data JPA ( 13 october 2021)




### changes : 

file : C:\Users\medaminebt\Downloads\project-spring-boot\project-spring-boot\src\main\resources\application.properties


C:/Users/medaminebt/Downloads/project-spring-boot/project-spring-boot/spring_logs/spring_log_file.log







```

### DATABASE ###
#spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/springDB
spring.datasource.username=root
spring.datasource.password=


### Logs ###
logging.level.root=INFO
logging.file.name=C:/Users/medaminebt/Downloads/project-spring-boot/project-spring-boot/spring_logs/spring_log_file.log
logging.pattern.console=%d{yyyy-MM-dd HH:mm:ss} - %-5level - %logger{60} - %msg%n
logging.logback.rollingpolicy.max-file-size=100KB  

```






Create DB on wampp server phpmyadmin ( data base name :  springdb ) 


SS of DB    http://localhost/phpmyadmin : 
![SS of DB http://localhost/phpmyadmin ](https://i.imgur.com/fJt96cd.png)










Generate getters & setters for : client.java , stock.java , facture.java ...etc 




### TEST on postman : 

* GET :  
http://localhost:8080/api/allstocks/

![ss_getallstocks](https://i.imgur.com/xRRaKzE.png)
<br /><br />
![ss getallstocks](https://i.imgur.com/qp4uWmd.png)



* GET :   
http://localhost:8080/api/stocks/2

![ss_getallstocks](https://i.imgur.com/yfgbs25.png)
![ss_getallstocks_](https://i.imgur.com/xr0GvBt.png)
![ss_getallstocks_1](https://i.imgur.com/PJ0KOJC.png)


* add a stock to DB -> POST : 
http://localhost:8080/api/stocks/

![ss_add new stock](https://i.imgur.com/zbehjBI.png)
![ss_add new stock _ db](https://i.imgur.com/I9htSUP.png)

* Modify stocks ->  PUT : http://localhost:8080/api/modifystocks

![ss _ modify stocks](https://i.imgur.com/0eEiSVX.png)


* delete a stock from db -> DELETE : http://localhost:8080/api/deletestocks/3
![ss_delete a stock from db](https://i.imgur.com/oArcXD9.png)




///////////////////////////////////////////////////////////////


* clients controller: 
![ss_clients _ controller _ code](https://i.imgur.com/L6s3KHU.png)



* add client -> POST :  http://localhost:8080/api/addclients/
![ss_addclients](https://i.imgur.com/nJly7Tv.png)

![ss_add_clients_db](https://i.imgur.com/f2IUkaH.png)


* Modify a client -> PUT :  http://localhost:8080/api/modifyclients/
![ss_modify_client](https://i.imgur.com/OdFhqdN.png)

![ss_modifyclients_db](https://i.imgur.com/eREaNjn.png)


* show all the clients -> GET : http://localhost:8080/api/allclients/
![ss_show all clients](https://i.imgur.com/UEYCzqD.png)


* delete a client ->  DELETE :  http://localhost:8080/api/deleteclients/1
![ss_delete_a_client](https://i.imgur.com/4Tprl64.png)
