# SPRINT ONE - Coffee Shop Order System API 
## Project Duration: January 31, 2026 – February 1, 2026

### Overview
The Coffee Shop Order System is a lightweight RESTful API built to demonstrate the fundamental principles of Layered Architecture in Spring Boot. It provides a backend service for managing coffee orders, handling business logic such as pricing and revenue calculation, and serving data via HTTP endpoints.

This project was built to enforce strict separation of concerns, ensuring that the web layer, service layer, and persistence layer remain distinct and testable.

### Concepts & Architecture
This project focuses on the core building blocks of modern Java backend development:

#### 1. Layered Architecture Pattern
The application is structured into three distinct layers to maintain separation of concerns:

```
a. Controller Layer (@RestController): Handles incoming HTTP requests and maps them to the appropriate service methods. It acts as the entry point for the API.
b. Service Layer (@Service): Contains the business logic. This is where pricing rules are applied, revenue is calculated, and data inputs are processed before storage.
c. Repository Layer (@Repository): Manages data access. For this project, an in-memory data store was implemented to simulate database interactions.
```
#### 2. Dependency Injection (DI) & Inversion of Control (IoC)
```
a. Utilized Constructor Injection rather than Field Injection (@Autowired) to ensure immutability and easier unit testing.
b. Spring's IoC container manages the lifecycle of beans, wiring dependencies automatically at startup.
```
#### 3. RESTful API Design
```
a. Implementation of standard HTTP verbs (GET, POST, DELETE) for resource management.
b. Proper use of HTTP Status Codes (e.g., 201 Created for new orders, 404 Not Found for invalid IDs).
c. Resource-oriented URL design.
```
#### 4. Modern Java & Data Integrity
```
a. Lombok Integration: Reduced boilerplate code using @Getter and @Setter.
b. Input Validation: Guard clauses prevent invalid data (e.g., empty customer names) from reaching the business logic.
c. Java 21: Built using the latest LTS standards.
```
### Tech Stack
* Language: Java 21
* Framework: Spring Boot 3.2+ (Spring Web)
* Build Tool: Maven
* Utilities: Lombok
* Testing: Postman/Insomnia
