package com.mongo.test.SpringMongoDb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.test.SpringMongoDb.entity.Student;
import com.mongo.test.SpringMongoDb.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping("/create")
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}
	
	@GetMapping("/getById/{id}")
	public Student getStudentById(@PathVariable String id) {
		return studentService.getStudentById(id);
	}
	
	@GetMapping("/all")
	public List<Student> getAllStudents() {
		return studentService.getAllStudent();
	}
	
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable String id) {
		return studentService.deleteById(id);
	}
	
	@GetMapping("/getStudentByName/{name}")
	public List<Student> getStudentByName(@PathVariable String name) {
		return studentService.getStudentByName(name);
	}
	
	@GetMapping("/allWithPagnigation")
	public List<Student> getStudentByName(@RequestParam int pageNo, @RequestParam int size) {
		return studentService.getAllWithPagnigation(pageNo, size);
	}
}
