Uptake Interview RESTFul Project
* Introduction
This application is a web based application to provide following functions:
    1.)People Creation
    2.)People Update
    3.)People Deletion
    4.)List All People
    5.)Family Creation
    6.)Group People into Family
-Framework:Spring Boot,spring-boot-starter-data-rest,spring-boot-starter-freemarker,spring-boot-starter-data-jpa
-Web Container:Embedded Tomcat
-Database:Embedded H2

*Requirements
Java 8
Maven 3.3.3

*URLs
http://localhost:8080/health
healthcheck endpoint, if this application is running,"Hello World!" will display
http://localhost:8080/familycreation
Create a family first before creating people
http://localhost:8080/create
Create a People with firstName,lastName and group it to Family
http://localhost:8080/
List all people created,on this page, you can select "Delete" or "Update"
http://localhost:8080/update?id={id}
Update existing people with id
http://localhost:8080/console
H2Database Console

*Endpoint
http://localhost:8080/people - Method = GET   : get all people
http://localhost:8080/people - Method = POST  : create one people,body in JSON
http://localhost:8080/people/{id} - Method = PUT  :update one people with id,body in JSON
http://localhost:8080/people/{id} - Method = DELETE :delete one people with id

http://localhost:8080/family - Method = GET   : get all families
http://localhost:8080/family - Method = POST  : create one family,body in JSON
http://localhost:8080/family/{id} - Method = PUT  :update one family with id,body in JSON
http://localhost:8080/family/{id} - Method = DELETE :delete one family with id


*Repository
https://github.com/mning/uptake

*Run Command
mvn package && java -jar target/update-spring-boot-0.1.0.jar
or
Run it through Intellij or Eclipse IDE

