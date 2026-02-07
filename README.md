# Space Weather Monitoring System (Backend)

A Spring Boot–based backend application designed to simulate a **Space Weather Monitoring System**.  
The project focuses on collecting, storing, and analyzing space weather parameters such as solar wind speed, radiation levels, geomagnetic activity (Kp Index), and CME probability.

This application is built as a **backend-only system**, following clean architecture and industry practices.  
It is intended to be extended later with authentication, authorization, and a web/UI layer.

---

##  Project Overview

Space weather events such as **solar flares**, **coronal mass ejections (CMEs)**, and **geomagnetic storms** can affect satellites, communication systems, navigation, and power grids.

This project simulates how a backend system:
- Receives space weather data
- Stores it in a relational database
- Evaluates alert levels based on scientific thresholds
- Exposes REST APIs for consumption by future web or mobile applications

---

## Key Features

- RESTful APIs using Spring Boot
- Domain-based data modeling
- PostgreSQL database integration
- Automatic table creation using Hibernate
- Alert-level evaluation logic
- Layered architecture (Controller, Service, Repository)
- Easily extensible for Spring Security and frontend integration

---

## Alert Level Logic

The alert level is evaluated based on the following rules:

SEVERE

Kp Index ≥ 7

Radiation Level ≥ 8

WARNING

Kp Index ≥ 5

Solar Wind Speed > 700 km/s

NORMAL

---

### Why This Project Matters

This project demonstrates:

Strong backend fundamentals

Database-driven application design

Real-world domain modeling

Clean separation of concerns

Readiness for enterprise-level extensions

---

## Tech Stack

- **Java**
- **Spring Boot**
- **Spring Web (REST APIs)**
- **Spring Data JPA**
- **Hibernate**
- **PostgreSQL**
- **Maven**
- **Postman** (for API testing)

---

## Project Architecture

src/main/java
└── com.spaceweather.demo
├── controller
│ └── WeatherController.java
├── service
│ └── WeatherService.java
├── repository
│ └── WeatherRepository.java
└── model
└── WeatherData.java

---

##  API Endpoints

### ➤ Add Weather Data
**POST**

/api/weather/add

### Request Body (JSON)
```json
{
  "solarSpeedOfWind": 820,
  "levelOfRadiation": 7.1,
  "kpIndex": 6,
  "cmeProbability": 0.5,
  "source": "L1"
}





