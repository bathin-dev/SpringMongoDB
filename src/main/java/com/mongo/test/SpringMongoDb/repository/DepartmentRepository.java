package com.mongo.test.SpringMongoDb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.test.SpringMongoDb.entity.Department;

public interface DepartmentRepository extends MongoRepository<Department, String>{

}
