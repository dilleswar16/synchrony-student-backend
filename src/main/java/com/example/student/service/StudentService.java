package com.example.student.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.student.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();

	Student addStudent(Student student);

	void deleteStudent(Long id);

	List<Student> searchStudentByName(String name);

	Student updateStudent(Student student);

}
