# Hotel Room Management and Reservation System - Spring Boot Backend

This repository contains the backend implementation of a Hotel Room Management and Reservation System using Spring Boot. The system provides functionalities for managing hotel rooms, reservations, customers, and staff, facilitating efficient hotel operations.

## Key Features
- **Room Management**: Add, update, and delete room details.
- **Reservation Management**: Book, update, and cancel reservations.
- **Customer Management**: Handle customer information and booking history.
- **Staff Management**: Manage staff details and roles.

## Technologies Used
- **Spring Boot**: For building the backend services.
- **Hibernate**: For ORM and database interactions.
- **MySQL**: As the relational database.
- **Spring Security**: For securing the application.

## Project Structure
- **src/main/java**: Contains the main application code.
- **src/main/resources**: Configuration files and static resources.
- **pom.xml**: Project Object Model file for Maven dependencies.

## Getting Started

### Prerequisites
- Java 17
- Maven
- MySQL

### Installation
1. **Clone the repository**:
   ```bash
   git clone https://github.com/Chanuth-silva10/hotel-room-management-and-reservation-system-spring-boot-backend.git

2. Configure the Database: Update the `application.properties` file with your MySQL database details.
   
4. Build and Run:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```
   
5. Access the Application: The application runs on `http://localhost:8080`.
