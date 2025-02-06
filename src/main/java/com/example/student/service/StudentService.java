package com.example.student.service;

import java.util.List;

import com.example.student.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();

	Student addStudent(Student student);

	void deleteStudent(Long id);

	Student updateStudent(Student student);

	List<Student> searchStudentByName(String name);

}
