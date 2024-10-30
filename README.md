# Inventory-Mgt-System

Project Overview

The Inventory Management System (IMS) is a RESTful web application built using Spring Boot, Java 21, and MariaDB. This system allows users to perform basic CRUD (Create, Read, Update, Delete) operations on products in an inventory. It also includes global exception handling, unit testing with JUnit 5, and follows best practices in modern software development.

This system is designed to demonstrate software processes in an agile environment, showcasing important concepts such as REST API design, exception handling, and testing.

Agile Project Plan

1. Goal: Build a robust, scalable inventory management system with CRUD operations (Create, Read, Update, Delete) for products.

2. Sprints:

Sprint 1: Project Setup, Database Design, API Design.
Sprint 2:  CRUD Operations Implementation, Service Layer.
Sprint 3: Testing with JUnit 5, Error Handling, and Agile Feedback.
Sprint 4: Refactoring, Optimization, Documentation, and Final Testing.

3. Tasks:

Sprint 1: Set up Spring Boot application, integrate MariaDB, create the abstract class (base class for entities), and define the Product entity.
Sprint 2: Implement CRUD operations using Spring Data JPA and REST APIs,Service Layer(Product Service, ProductNotFoundException and Global Exception), Controller Layer(Product Controller).
Sprint 3: Unit testing using JUnit 5, implement business logic.
Sprint 4: CORS connecting to the Frontend,Conduct user acceptance testing, optimize code, and prepare for deployment.

Features

    CRUD Operations: Create, Read, Update, and Delete products.
    REST API: Provides a simple REST API to interact with the inventory.
    Exception Handling: Global exception handler for clear and consistent error messages.
    Unit Testing: Test-driven development using JUnit 5.
    Database: Uses MariaDB for data persistence.
    Agile Development: Follows agile principles with iterative development and regular testing.

    Tech Stack

    Backend: Spring Boot, Java 21
    Database: MariaDB
    Testing: JUnit 5
    API: RESTful Web Services
    Build Tool: Maven
    Dependency Management: Spring Boot Starter Data JPA, Spring Boot Starter Web
    Version Control: GitHub

    Getting Started
Prerequisites

Before running the application, ensure you have the following installed on your machine:

    Java 21 or higher
    Maven (for building the project)
    MariaDB (or any other compatible database)
    IDE: Any Java IDE like IntelliJ IDEA or VS Code

Clone the repository
