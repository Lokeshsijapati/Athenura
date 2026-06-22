# Athenura Billing System

A billing and invoice management system built with Spring Boot. Handles everything from client onboarding to PDF invoice generation with role-based access control.

---

## Tech Stack

- Java, Spring Boot
- Spring Security + JWT
- MySQL, Spring Data JPA
- Thymeleaf
- Cloudinary (file storage)
- Java Mail (email alerts)
- Maven

---

## Features

- Role-based client onboarding (Admin / Client)
- JWT secured REST APIs
- Async PDF invoice generation and download
- Product and customer CRUD
- Cloudinary integration for file/image uploads
- Email notifications for billing events

---

## Project Structure

```
src/
├── controller/     API request handling
├── service/        Business logic
├── repository/     Database layer (JPA)
├── entity/         DB models
├── dto/            Data transfer objects
└── config/         Security and app config
```

---

## Setup

1. Clone the repo
```bash
git clone https://github.com/Lokeshsijapati/Athenura-Billing-System.git
cd Athenura-Billing-System
```

2. Add your credentials in `application.properties`
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/athenura_db
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

cloudinary.cloud-name=YOUR_CLOUD_NAME
cloudinary.api-key=YOUR_API_KEY
cloudinary.api-secret=YOUR_API_SECRET

spring.mail.username=YOUR_EMAIL
spring.mail.password=YOUR_PASSWORD
```

3. Run
```bash
mvn spring-boot:run
```

