## Student Management API

This API allows you to manage student records. You can add, update, delete, and search for students.

### Base URL
The base URL for all API endpoints is:  
```
http://localhost:8080/students
```

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- H2 Database

---

### Endpoints

## 1. GET /students
**Description**: Retrieves all students from the system.

**Response**:
- Status Code: 200 OK
- Body: A list of all students with their details.
```
Example Response:
[
  {
    "id": 1,
    "name": "John Doe",
    "age": 20,
    "studentClass": "12th",
    "phoneNumber": "1234567890"
  },
  {
    "id": 2,
    "name": "Jane Smith",
    "age": 19,
    "studentClass": "11th",
    "phoneNumber": "0987654321"
  }
]
```


## 2. `POST /students/addstudent`
**Description**: Adds a new student to the system.
```
**Request Body**:
{
  "name": "John Doe",
  "age": 20,
  "studentClass": "12th",
  "phoneNumber": "1234567890"
}

**Response**:
- Status Code: 201 Created
- Body: The created student object with assigned `id`.

Example Response:
{
  "id": 1,
  "name": "John Doe",
  "age": 20,
  "studentClass": "12th",
  "phoneNumber": "1234567890"
}
```


## 3. GET /students/search/{name}
**Description**: Searches for students by name (case-insensitive).

**Parameters**:
- `name`: The name (or partial name) of the student to search for.

Example Request:  
GET /students/search/John

**Response**:
- Status Code: 200 OK
- Body: A list of students whose names contain the search term.

Example Response:
[
  {
    "id": 1,
    "name": "John Doe",
    "age": 20,
    "studentClass": "12th",
    "phoneNumber": "1234567890"
  }
]


## 4. PUT /students/updatestudent

**Description**: Updates an existing student's details.

**Request Body**:
{
  "id": 1,
  "name": "John Doe",
  "age": 21,
  "studentClass": "12th",
  "phoneNumber": "9876543210"
}

**Response**:
- Status Code: 200 OK
- Body: The updated student object.

Example Response:
{
  "id": 1,
  "name": "John Doe",
  "age": 21,
  "studentClass": "12th",
  "phoneNumber": "9876543210"
}


## 5. DELETE /students/{id}

**Description**: Deletes a student by their ID.

**Parameters**:
- `id`: The ID of the student to be deleted.

Example Request:  
DELETE /students/1

**Response**:
- Status Code: 204 No Content
- Body: None (student is deleted successfully).





