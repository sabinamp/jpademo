### Kotlin-based Maven project with Spring Boot. 
**Dependencies** Spring Web, MySQL, H2, JPA, Dev Tools

*:white_medium_small_square: GET http://localhost:8080/users: To get a list of all users
*:white_medium_small_square: GET http://localhost:8080/user/1: To get a specific user details
*:white_medium_small_square: POST http://localhost:8080/user/new: To insert a new user
*:white_medium_small_square: PUT http://localhost:8080/user/1: To update a specific user details
*:white_medium_small_square: DELETE http://localhost:8080/user/2: To delete a specific user's details
The User class is a model class with the following fields:

| Syntax | Description |
| ----------- | ----------- |
| Header | Title |
| id     | Primary key with auto increment |
| name   | (NOT NULL field)|
| email  | (NOT NULL field)|
| contact_nb| (NOT NULL field)|
