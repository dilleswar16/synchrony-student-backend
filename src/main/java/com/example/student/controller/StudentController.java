package com.example.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.entity.Student;
import com.example.student.service.StudentService;

@CrossOrigin("*")
@RestController
@RequestMapping("/students")
public class StudentController {
	 @Autowired
	    private StudentService service;
	private Student updatedStudent;

	    @PostMapping("/addstudent")
	    public Student addStudent(@RequestBody Student student) { return service.addStudent(student); }

	    @GetMapping
	    public List<Student> getAllStudents() { return service.getAllStudents(); }

	    @GetMapping("/search/{name}")
	    public List<Student> searchStudent(@PathVariable String name)
	    { 
	    	System.out.println(name);
	    	return service.searchStudentByName(name);
	    }

	    @PutMapping("/updatestudent")
	    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
	        Student updatedStudent = service.updateStudent(student);
	        return ResponseEntity.ok(updatedStudent);
	    }


	    @DeleteMapping("/{id}")
	    public void deleteStudent(@PathVariable Long id) { service.deleteStudent(id); }

}
