# FinalSpringBootProject
This is my final Spring Boot Project for Html. It contains two seperate Database which are hosted locally. 
One databse is to display contact infomation for members to contact each other.
The other is a display of the members stats.

///////////////////////////////////////////////////////////////////////////////////////////////////////////
Programmig language: java
Project Type: Maven
Choose dependencies: Spring Web, Lombok, Spring Data JPA, spring-boot-starter-thymeleaf, and MySQL Driver,

Download My FinalSpringBootproject and import it (unziped) into IntelliJ IDEA.
run FinalSpringBootApplication.java
-- please note that you may have to change the url / user / and password in apllication properties to host this locally --
-- I reccomend keeping it on server 9998:

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

Test Update Gamer with REST API:
in postman enter ( as a put request) enter: http://localhost:9998/Gamer
within the body (raw/Json format) enter the data you would like to update 
e.g.

{
        "id": 1,
        "firstName": "adrian",
        "lastName": "leadley",
        "emailAddress": "adrian@gmail"
    }

Test Delete Gamer REST API:
in postman (as a delete request) enter: http://localhost:9998/Gamer/{id}
{} = whatever id you want to delete.


/////////////////////////////////////////////////////////////////////////////////

To run the Html:
run the local host in web browser to access the home page. (http://localhost:9998/)
here you can access the compare and community page from the two tabs.
