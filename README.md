## Overview

Virtual Bookstore is a full-stack web application that allows users to browse, search, and manage books through an interactive online platform. The project is designed to provide a seamless digital bookstore experience with a user-friendly interface and efficient backend functionality.

The application enables users to explore available books, view details, and manage bookstore operations through a modern web-based system.

---

## Features

### User Features
- Browse available books
- Search books by title or author
- View detailed book information
- Responsive and user-friendly interface
- Easy navigation across book categories

### Admin Features
- Add new books
- Update existing book details
- Delete books from inventory
- Manage bookstore catalog
- Monitor available books

### Common Features
- REST API integration
- Database connectivity
- CRUD operations
- Responsive design
- Frontend-backend communication

---

## Technology Stack

### Frontend
- React.js
- Vite
- JavaScript
- HTML5
- CSS3

### Backend
- Java
- Spring Boot
- Spring Web
- Spring Data JPA

### Database
- MySQL

### Tools
- Maven
- Git & GitHub
- Postman
- IntelliJ IDEA / VS Code

---

## Project Architecture

```text
User
 │
 ▼
React Frontend
 │
 ▼
Spring Boot REST API
 │
 ▼
Service Layer
 │
 ▼
Repository Layer
 │
 ▼
MySQL Database
````

---

## Project Structure

```text
Virtual-Bookstore/
│
├── backend/
│   ├── src/main/java/
│   │   ├── controller/
│   │   ├── service/
│   │   ├── repository/
│   │   ├── model/
│   │   └── VirtualBookstoreApplication.java
│   │
│   ├── src/main/resources/
│   │   └── application.properties
│   │
│   └── pom.xml
│
├── frontend/
│   ├── src/
│   ├── public/
│   ├── package.json
│   └── vite.config.js
│
└── README.md
```

---

## Database Configuration

Configure MySQL in `application.properties`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/bookstoredb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## Installation and Setup

### 1. Clone Repository

```bash
git clone https://github.com/Deepshikha-Mohanty/Virtual-Bookstore.git
cd Virtual-Bookstore
```

---

### 2. Setup Database

Create a MySQL database:

```sql
CREATE DATABASE bookstoredb;
```

---

### 3. Run Backend

Navigate to backend directory:

```bash
cd backend
```

Run Spring Boot application:

```bash
mvn spring-boot:run
```

Backend runs on:

```http
http://localhost:8080
```

---

### 4. Run Frontend

Navigate to frontend directory:

```bash
cd frontend
```

Install dependencies:

```bash
npm install
```

Start frontend:

```bash
npm run dev
```

Frontend runs on:

```http
http://localhost:5173
```

---

## API Endpoints

### Books

| Method | Endpoint        | Description    |
| ------ | --------------- | -------------- |
| GET    | /api/books      | Get all books  |
| GET    | /api/books/{id} | Get book by ID |
| POST   | /api/books      | Add new book   |
| PUT    | /api/books/{id} | Update book    |
| DELETE | /api/books/{id} | Delete book    |

---

## Book Entity Example

```java
public class Book {

    private Long id;
    private String title;
    private String author;
    private Double price;
    private String category;
    private String description;

}
```

---

## Application Workflow

1. User accesses the Virtual Bookstore.
2. Frontend sends requests to backend APIs.
3. Spring Boot processes requests.
4. Data is retrieved from MySQL database.
5. Response is returned to frontend.
6. Books are displayed to the user.

---

## Future Enhancements

* User authentication and authorization
* Shopping cart functionality
* Book purchasing system
* Wishlist feature
* Order management
* Payment gateway integration
* Book reviews and ratings
* Category filtering
* Cloud deployment

---

## Learning Outcomes

This project demonstrates:

* Full-stack web development
* REST API creation and integration
* Spring Boot backend development
* React frontend development
* MySQL database management
* CRUD operations
* Client-server architecture

---

## Author

**Deepshikha Mohanty**

GitHub: [https://github.com/Deepshikha-Mohanty](https://github.com/Deepshikha-Mohanty)

---

## License

This project is created for educational and learning purposes.

