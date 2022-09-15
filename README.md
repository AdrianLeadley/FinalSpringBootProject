# FinalSpringBootProject
This is my final Spring Boot Project for Html. It contains two seperate Database which are hosted locally.
One databse is to display contact infomation for members to contact each other.
The other is a display of the members stats.

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Programmig language: java
Project Type: Maven
Choose dependencies: Spring Web, Lombok, Spring Data JPA, spring-boot-starter-thymeleaf, and MySQL Driver,

Download My FinalSpringBootproject and import it (unziped) into IntelliJ IDEA.
run FinalSpringBootApplication.java 

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
Use post man to test CRUD REST APIs

Testing Get All Gamers with REST API:
in postman (as a get request) enter: http://localhost:9998/Gamer 

Testing Create Gamers with REST API:
in postman enter ( as a post request) enter: http://localhost:9998/CreateGamer
within the body (raw/Json format) enter the data you would like to enter 
e.g.

{
        "id": 1,
        "firstName": "bobby",
        "lastName": "leadley",
        "emailAddress": "bob@gmail"
    }
    
Test Get Gamer By Id with  REST API: 
in postman (as a get request) enter: http://localhost:9998/Gamer/{id}
{} = whatever id you want to search by.
