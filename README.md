# Inventory Management System (IMS)

## Project Overview

The Inventory Management System (IMS) is a RESTful web application built using **Spring Boot**, **Java 21**, and **MariaDB**. This system allows users to perform basic CRUD (Create, Read, Update, Delete) operations on products in an inventory. It also includes global exception handling, unit testing with JUnit 5, and follows best practices in modern software development.

This system is designed to demonstrate software processes in an agile environment, showcasing important concepts such as REST API design, exception handling, and testing.

## Features

- **CRUD Operations**: Create, Read, Update, and Delete products.
- **REST API**: Provides a simple REST API to interact with the inventory.
- **Exception Handling**: Global exception handler for clear and consistent error messages.
- **Unit Testing**: Test-driven development using JUnit 5.
- **Database**: Uses MariaDB for data persistence.
- **Agile Development**: Follows agile principles with iterative development and regular testing.

## Tech Stack

- **Backend**: Spring Boot, Java 21
- **Database**: MariaDB
- **Testing**: JUnit 5
- **API**: RESTful Web Services
- **Build Tool**: Maven
- **Dependency Management**: Spring Boot Starter Data JPA, Spring Boot Starter Web
- **Version Control**: GitHub

## Getting Started

### Prerequisites

Before running the application, ensure you have the following installed on your machine:

- **Java**: Version 21 or higher
- **Maven**: For building the project
- **MariaDB**: Or any other compatible database
- **IDE**: Any Java IDE like IntelliJ IDEA or VS Code

### Clone the Repository

To get started with the project, clone the repository to your local machine using the following command:

```bash
git clone <repository-url>

## Setting Up the Database
### Create a new database in MariaDB:

sql

CREATE DATABASE Inventorydb;

## Update your application.properties file with your database credentials:

### properties

spring.datasource.url=jdbc:mariadb://localhost:3306/inventory_management
spring.datasource.username=<your-username>
spring.datasource.password=<your-password>

## Build the Project
### Navigate to the project directory and run the following command to build the project:

```bash

mvn clean install
Running the Application
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
Copy code

### Instructions for Use:
- Replace `<repository-url>`, `<your-username>`, and `<your-password>` with the actual details.
- Adjust any section based on your project’s specific needs or additional features you might want to include.
- Ensure the README is located in the root of your backend project repository for easy access.

This structured approach not only guides users through the setup and usage of your project but also provides them with essential information about its functionality and development processes.
