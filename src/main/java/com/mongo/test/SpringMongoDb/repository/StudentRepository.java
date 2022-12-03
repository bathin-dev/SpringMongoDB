package com.mongo.test.SpringMongoDb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.test.SpringMongoDb.entity.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

	List<Student> findByName(String name);

	List<Student> getAllWithPagnigation(int pageNo, int size);

}
