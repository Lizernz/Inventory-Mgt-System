# Inventory Management System (IMS)

## Project Overview

The Inventory Management System (IMS) is a RESTful web application built using **Spring Boot**, **Java 21**, and **MariaDB**. This system allows users to perform basic CRUD (Create, Read, Update, Delete) operations on products in an inventory. It also includes global exception handling, unit testing with JUnit 5, and follows best practices in modern software development.

## Goal

<<<<<<< HEAD
=======
Basic CRUD functionality for product entities.
Error handling for smoother user experience.
Separation of business logic, data access, and error handling for scalability.


>>>>>>> 6d76495 (Updated README.md)
## Features

- **CRUD Operations**: Create, Read, Update, and Delete products.
- **REST API**: Provides a simple REST API to interact with the inventory.
- **Exception Handling**: Global exception handler for clear and consistent error messages.
- **Unit Testing**: Test-driven development using JUnit 5.
- **Database**: Uses MariaDB for data persistence.
- **Agile Development**: Follows agile principles with iterative development and regular testing.

<<<<<<< HEAD
## Tech Stack
=======
   ## Tech Stack
>>>>>>> 6d76495 (Updated README.md)

- **Backend**: Spring Boot, Java 21
- **Database**: MariaDB
- **Testing**: JUnit 5
- **API**: RESTful Web Services
- **Build Tool**: Maven
- **Dependency Management**: Spring Boot Starter Data JPA, Spring Boot Starter Web
- **Version Control**: GitHub

<<<<<<< HEAD
## Getting Started

### Prerequisites
=======
## Product Management

ProductController: Handles REST endpoints for creating, retrieving, updating, and deleting products.
Strength: Clear separation of controller, service, and repository layers enhances readability and maintainability.

## Exception Handling

Custom ProductNotFoundException thrown when a product isn’t found, and a GlobalExceptionHandler catches it.
Strength: Centralized error handling prevents code duplication, makes debugging easier, and enhances user feedback

   ##  Getting Started
Prerequisites
>>>>>>> 6d76495 (Updated README.md)

Before running the application, ensure you have the following installed on your machine:

- **Java**: Version 21 or higher
- **Maven**: For building the project
- **MariaDB**: Or any other compatible database
- **IDE**: Any Java IDE like IntelliJ IDEA or VS Code

### Clone the Repository

To get started with the project, clone the repository to your local machine using the following command:

```bash
git clone https://github.com/Lizernz/Inventory-Mgt-System.git

## Setting Up the Database
### Create a new database in MariaDB:

<<<<<<< HEAD
sql

CREATE DATABASE Inventorydb;

## Update your application.properties file with your database credentials:

### properties

spring.datasource.url=jdbc:mariadb://localhost:3306/inventory_management
spring.datasource.username=<your-username>
spring.datasource.password=<your-password>

>>>>>>> 6d76495 (Updated README.md)

## Build the Project
### Navigate to the project directory and run the following command to build the project:

```bash

mvn clean install

## Running the Application

You can run the application using your IDE or by executing the following command in the terminal:

```bash

mvn spring-boot:run

## API Endpoints
The application provides the following RESTful endpoints:

GET /api/products: Retrieve all products
POST /api/products: Create a new product
GET /api/products/{id}: Retrieve a product by ID
PUT /api/products/{id}: Update an existing product
DELETE /api/products/{id}: Delete a product by ID

## Unit Testing
To run the unit tests, use the following command:

```bash

mvn test

## Contributing
Contributions are welcome! Please open an issue or submit a pull request for any enhancements or bug fixes.

## License
This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgments

Spring Boot
MariaDB
JUnit 5
markdown

## Future Enhancements

Data Validation Enhancements: Use more advanced validation annotations for input fields and possibly integrate deeper validation checks.
Pagination for Product Lists: As the list of products grows, adding pagination would help in managing large data sets.
Documentation: Auto-generate API documentation using Swagger or Spring REST Docs for easier API consumption.


## Conclusion

This backend project is structured with scalability, testability, and maintainability in mind. It leverages Spring Boot’s powerful features to create a solid foundation for an API-centric application. The project serves as a robust inventory management API with a clear path for extension and enhancement.
>>>>>>> 6d76495 (Updated README.md)
