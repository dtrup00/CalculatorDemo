# Calculator Application

A simple calculator application built using Spring Boot. This project demonstrates basic CRUD operations, RESTful API design, and unit testing with JUnit.

## Features
1. ### Basic Operations
- **Addition**: Add two numbers.
- **Subtraction**: Subtract one number from another.
- **Multiplication**: Multiply two numbers.
- **Division**: Divide one number by another.

2. ### Scientific Operations
- **Square**: Find the square of a number.
- **Square Root**: Find the square root of a number.
- **Power**: Raise a number to the power of another.
- **Logarithm**: Calculate the natural logarithm (base e).
- **Trigonometric Functions**: Calculate `sin`, `cos`, and `tan` for a given angle.

3. RESTful API for performing operations
4. Unit testing with JUnit

## Requirements
- Java 17 or higher
- Spring Boot 3.0+
- Maven 3.8+

## API Endpoints
### Basic Operations
| Operation     | HTTP Method | Endpoint                    | Parameters       |
|---------------|-------------|-----------------------------|------------------|
| Addition      | GET         | `/api/calculate/add`        | `firstNum`, `secondNum`|
| Subtraction   | GET         | `/api/calculate/subtract`   | `firstNum`, `secondNum`|
| Multiplication| GET         | `/api/calculate/multiply`   | `firstNum`, `secondNum`|
| Division      | GET         | `/api/calculate/divide`     | `firstNum`, `secondNum`|

### Scientific Operations
| Operation            | HTTP Method | Endpoint                     | Parameters        |
|-----------------------|-------------|------------------------------|-------------------|
| Square               | GET         | `/api/calculate/square`      | `a`               |
| Square Root          | GET         | `/api/calculate/square-root` | `a`               |
| Power                | GET         | `/api/calculate/power`       | `base`, `exponent`|
| Logarithm            | GET         | `/api/calculate/log`         | `a`               |
| Sine (sin)           | GET         | `/api/calculate/sin`         | `angle`           |
| Cosine (cos)         | GET         | `/api/calculate/cos`         | `angle`           |
| Tangent (tan)        | GET         | `/api/calculate/tan`         | `angle`           |
