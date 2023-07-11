# Employee address

This is an Ecommerce API built with Spring Boot and MySQL database. The API provides endpoints for managing users, products, addresses, and orders.

## ##  Prerequisites

- Java 11
- MySQL database
- Maven

## ##  Getting Started

1. Clone the repository:

2.Configure the database connection in the application.properties file located in the src/main/resources directory:
    ```shell
    spring.datasource.url=jdbc:mysql://localhost:3306/EmpAddress
    spring.datasource.username=root
    spring.datasource.password=Am112
    spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
    spring.jpa.hibernate.ddl-auto=update

    spring.jpa.properties.hibernate.show_sql=true
    spring.jpa.properties.hibernate.use_sql_comments=true
    spring.jpa.properties.hibernate.format_sql=true
    API Endpoints

## GET/PUT?POST

  * POST /products: Create a new employee/Address.

  * GET /products: Get all employee.

  * GET /products?category={category}: Get products by category (query parameter).

  * DELETE /Employee/{id}: Delete  by ID.



License
* This project is licensed under the GEEKSTER License.
