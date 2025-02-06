## Student Management API

This API allows you to manage student records. You can add, update, delete, and search for students.

### Base URL
The base URL for all API endpoints is:  
`http://localhost:8080/students`

---

### Endpoints

## 1. `POST /students/addstudent`
```plaintext
**Description**: Adds a new student to the system.

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
