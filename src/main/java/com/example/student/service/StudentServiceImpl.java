package com.example.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repository;

	@Override
	public List<Student> getAllStudents() {
		return repository.findAll();
	}

	@Override
	public Student addStudent(Student student) {
		return repository.save(student);
	}

	@Override
	public void deleteStudent(Long id) {
		repository.deleteById(id);
	}


	@Override
	public Student updateStudent(Student student) {
	    return repository.findById(student.getId()) // Fetch existing student by ID
	        .map(existingStudent -> {
	        	existingStudent.setId(student.getId());
	            existingStudent.setName(student.getName()); 
	            existingStudent.setAge(student.getAge());
	            existingStudent.setStudentClass(student.getStudentClass());
	            existingStudent.setPhoneNumber(student.getPhoneNumber());
	            return repository.save(existingStudent); // Save updated student
	        })
	        .orElseThrow(() -> new RuntimeException("Student not found with ID: " + student.getId())); // Handle not found case
	}

	
	@Override
	    public List<Student> searchStudentByName(String name) { return repository.findByNameIgnoreCaseContaining(name); }

}
