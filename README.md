# springboot-application-4SAE8
### Spring boot project - class 4SAE8





### changes : 

file : C:\Users\medaminebt\Downloads\project-spring-boot\project-spring-boot\src\main\resources\application.properties


create empty file : 


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






use Wampp server to create DB ( data base name :  springdb ) 



SS DB : 
https://i.imgur.com/fJt96cd.png





Generate getters & setters for : client.java , stock.java , facture.java


SS : https://i.imgur.com/ytq2uOY.png

Install the Lombok ( after you install it , re-open STS  and do : maven > upadte project )  : 


https://i.imgur.com/MwHg7Bj.png


https://i.imgur.com/isYlPMO.png




### TEST on postman : 

GET :  
http://localhost:8080/api/clients/


