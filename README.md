# Property Management System

## Project Summary
The **Property Management System** is a web application designed to manage real estate properties. It provides CRUD (Create, Read, Update, Delete) functionality for property listings, allowing users to add, view, update, and delete properties. The system also supports pagination and search functionality to filter properties by address, price, and size.

### Key Features:
- **Create Property**: Add new property listings with details such as address, price, size, and description.
- **Read Property**: View a list of all properties or search for specific properties using filters.
- **Update Property**: Modify existing property details.
- **Delete Property**: Remove properties from the system.
- **Pagination**: Browse properties in pages for better usability.
- **Search**: Filter properties by address, price range, and size.

## Deployment Video


https://github.com/user-attachments/assets/2f8a48fd-57fe-447a-a082-b20c9e934cc6


## Getting Started

These instructions will guide you to get a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

To run this project, you need the following software installed on your local machine:

- **Java 17+**: The project is built using Java. 
- **Maven**: Used for dependency management.
- **IDE (optional)**: An Integrated Development Environment like IntelliJ IDEA can be used for development.

### Installing

Follow these steps to get the development environment running:

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Nat15005/AREP_CRUD_SYSTEM.git
   ```
2. **Navigate to the project folder:**
   ```bash
   cd AREP_CRUD_SYSTEM
   ```
3. **Build the project using Maven:**
   ```bash
   mvn clean install
   ```

### Running the Server

Once the project is built, you can start the server with the following command:

```bash
java -cp target/classes arep.crudsystem.Application
```

The server will start and listen on port `8080`.

### Accessing the Application

Open your web browser and go to:

```
http://localhost:8080/
```

You should see the main page of the application.

![Captura de pantalla 2025-03-06 000624](https://github.com/user-attachments/assets/58e1e4d4-0112-4327-b7f6-d57774a6e2b8)



## System Architecture
The system is divided into three main components:

1. Frontend: Built with HTML, CSS, and JavaScript. It provides a user interface for interacting with the property management system.

2. Backend: Implemented with Spring Boot, it exposes RESTful APIs for CRUD operations on properties.

3. Database: MySQL is used to store property data. The database is accessed via JPA/Hibernate in the backend.

### Interaction Flow:
1. The frontend sends HTTP requests (GET, POST, PUT, DELETE) to the backend.
2. The backend processes the requests, performs the necessary operations, and interacts with the database.
3. The database stores and retrieves property data as requested by the backend.
4. The backend sends responses back to the frontend, which displays the results to the user.

### Class Design

The main classes in the system are:

Property: Represents a property entity with attributes like id, address, price, size, and description.

PropertyController: REST controller that handles HTTP requests for CRUD operations.

PropertyService: Contains the business logic for managing properties.

PropertyRepository: Interface for database operations using JPA.

### Deployment Instructions

### Screenshots

Here are some screenshots of the system in action:

Home Page: Displays a list of properties.

Create Property: Form for adding a new property.

Edit Property: Form for updating an existing property.

Delete Property: Confirmation dialog for deleting a property.

### Running Tests

### Technologies Used

### Author

### Acknowledgments
