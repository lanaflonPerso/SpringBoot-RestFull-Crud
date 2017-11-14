# User Management Java EE/DB driven BackEnd WebApp

Used technology : <b>IntelliJ Idea, Spring Core, Spring Boot, Spring Rest, Spring Data Jpa, MySql Database, Git, Maven Multi Module Project, Java EE 7, Server target : Tomcat.</b>
<br><br>
Objective : Create, read, update and delete operations of Users on MySql Db through ResFull WebServices that returns JSon data (format data exchange exposed, for example, to be managed from Angular 2 Framework)
____________________________________

Please note :

- the sql script of Db Table named "User" is under the folder ...
- at the application start up an sql insert is executed in order to store 3 different user by default
- to read all stored User, lunch from browser : localhost:8080/getAllUsers
- to search a specific User by surname, lunch from browser : localhost:8080/getBySurname?surname=[surname]
- to create a User, lunch from browser : localhost:8080/create?name=[name]&surname[surname]
- to delete a specific User, lunch from browser : localhost:8080/delete?id=[id]
- to update a specific User, lunch from browser : localhost:8080/update?id=[id]&name=[name]&surname[surname]

____________________________________

November 2017 - @author : Mauro Camelo
