package com.willen.restapiwithmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.willen.restapiwithmongodb.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
