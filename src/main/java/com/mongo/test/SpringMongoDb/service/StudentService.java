package com.mongo.test.SpringMongoDb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.mongo.test.SpringMongoDb.entity.Student;
import com.mongo.test.SpringMongoDb.repository.StudentRepository;

@Component
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	public Student getStudentById(String id) {
		return studentRepository.findById(id).get();
	}

	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	public String deleteById(String id) {
		studentRepository.deleteById(id);
		return "Student delete success!";
	}

	public List<Student> getStudentByName(String name) {
		return studentRepository.findByName(name);
	}

	public List<Student> getAllWithPagnigation(int pageNo, int size) {
		Pageable pageable = PageRequest.of(pageNo - 1, size);
		return studentRepository.findAll(pageable).getContent();
	}
}
