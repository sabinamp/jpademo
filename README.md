### Kotlin-based Maven project with Spring Boot. 
**Dependencies** Spring Web, MySQL, H2, JPA, Dev Tools

* GET http://localhost:8080/users: To get a list of all users
* GET http://localhost:8080/user/1: To get a specific user details
* POST http://localhost:8080/user/new: To insert a new user
* PUT http://localhost:8080/user/1: To update a specific user details
* DELETE http://localhost:8080/user/2: To delete a specific user's details

The **User** class is a model class with the following fields:

| Syntax | Description |
| ----------- | ----------- |
| Header | Title |
| id     | Primary key with auto increment |
| name   | (NOT NULL field)|
| email  | (NOT NULL field)|
| contact_nb| (NOT NULL field)|

**Database Configuration**
The MySQL database configuration details are given in the application.properties file
- dbname ch6db, table user_jpa