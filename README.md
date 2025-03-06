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

---

## System Architecture
The system is built using a **3-tier architecture**:
1. **Frontend**: A simple user interface built with HTML, JavaScript, and CSS. It communicates with the backend via REST APIs.
2. **Backend**: A Spring Boot application that handles business logic and exposes RESTful endpoints for CRUD operations.
3. **Database**: A MySQL database for storing property data. The backend interacts with the database using Spring Data JPA.

### Interaction Flow:
1. The frontend sends HTTP requests (GET, POST, PUT, DELETE) to the backend.
2. The backend processes the requests, performs the necessary operations, and interacts with the database.
3. The database stores and retrieves property data as requested by the backend.
4. The backend sends responses back to the frontend, which displays the results to the user.
