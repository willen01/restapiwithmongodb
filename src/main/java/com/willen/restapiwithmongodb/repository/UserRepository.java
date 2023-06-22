package com.willen.restapiwithmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.willen.restapiwithmongodb.domain.User;

public interface UserRepository extends MongoRepository<User, String> {
}
