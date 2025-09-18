# 📘 Details Backend

**14_TE_CompA: 2025–26**  
**Author:** Shreevathsa Bhat

---

## 🚀 Project Overview

**Name:** Details Backend  
**Purpose:** REST API backend for managing student details (name, roll number, division)  
**Framework:** Spring Boot  
**Database:** PostgreSQL (Dockerized)  
**API Documentation:** Swagger / OpenAPI  
**Deployment:** Fully containerized with Docker, hosted on [Render](https://render.com) (free tier)

---

## 🔗 Links

- **Hosted Backend:** [`https://details-fdyz.onrender.com`](https://details-fdyz.onrender.com/)
- **Hosted Postgres:** "cant publically provide!!!"
- **GitHub Repository:** [DetailsHackathon](https://github.com/Shreevathsa05/DetailsHackathon)
- **Swagger UI:** [`/swagger-ui/index.html#`](https://details-fdyz.onrender.com/swagger-ui/index.html#)
- **Backend Docker Image:**  
  ```bash
  docker pull shreevathsa05/details:latest
---
## Unique Selling Points (USPs)

1. Dockerized PostgreSQL and Backend
2. Fully containerized backend and database
3. Hosted on Render free tier - no local setup required
4. Unique Deployment Strategy
   - PostgreSQL hosted via Docker on Render (uncommon but effective)
5. Real-Time API Testing
6. Swagger UI for live interaction
7. Postman test screenshots available for validation

## Features

1. Full CRUD operations for student details
2. Auto-generated REST endpoints via Spring Data REST
3. JPA entity mapping for PostgreSQL

## Overview

This project is a REST API backend for managing student details using the following technologies:

| Layer        | Technology     |
| ---          | ---            |
| Backend Framework | Spring Boot   |
| Database       | PostgreSQL (Dockerized)  |
| ORM           | JPA / Hibernate  |
| API Docs      | Springdoc OpenAPI    |
| Deployment     | Docker + Render (Free)   |
| Build Tool     | Maven          |
| Java Version   | 21            |

## Project Structure

```bash
├── com.shree.details
│   ├── model
│   │   └── Details.java         // Entity representing student
│   ├── repo
│   │   └── DetailsRepo.java     // JPA repository
│   └── application.properties   // DB + server config
```

## Key Code Snippets

### Entity Class

```java
@Entity
public class Details {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String rollNumber;
    private String division;
}
```

### Repository Interface

```java
@RepositoryRestResource(collectionResourceRel = "details", path = "details")
public interface DetailsRepo extends JpaRepository<Details, Integer> {}
```

## Setup Instructions (Optional for Local Dev)

1. Clone the repo:
   ```bash
   git clone https://github.com/Shreevathsa05/DetailsHackathon
   ```
   Don't forget to put you psql credentials
2. Build the project:
   ```bash
   mvn clean install
   ```
3. Run the app:
   ```bash
   mvn spring-boot:run
   ```

## API Testing

Use Swagger UI at [/swagger-ui/index.html#](https://details-fdyz.onrender.com/swagger-ui/index.html#)
