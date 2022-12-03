package com.mongo.test.SpringMongoDb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.test.SpringMongoDb.entity.Subject;

public interface SubjectRepository extends MongoRepository<Subject, String> {

}
