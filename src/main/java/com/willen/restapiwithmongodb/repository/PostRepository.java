package com.willen.restapiwithmongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.willen.restapiwithmongodb.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {
    List<Post> findByTitleContainingIgnoreCase(String text);
}
