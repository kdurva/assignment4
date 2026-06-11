# Function Mapping Application

A simple Spring Boot application demonstrating different request mappings that return various data types such as String, Integer, Boolean, and Character through REST endpoints.

## Objective

To understand how request mapping works in Spring Boot and how different routes can return different types of responses.

## Features

* Return String value
* Return Integer value
* Return Boolean value
* Return Character value
* REST API endpoints using Spring Boot

## Technologies Used

* Java 21
* Spring Boot
* Spring Web
* Maven

## API Endpoints

### String Response

GET /message

Response:

Hello Spring Boot

### Integer Response

GET /number

Response:

100

### Boolean Response

GET /status

Response:

true

### Character Response

GET /grade

Response:

A

## Project Structure

src

* controller
* Assignment4Application

## How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Run the main Spring Boot application.
4. Open a browser or Postman.
5. Access the endpoints using:

http://localhost:8080/

## Learning Outcomes

* Understanding @RestController
* Understanding @GetMapping
* Understanding URL routing
* Returning different data types from APIs

## Author

Durva Kashid
