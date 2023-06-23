package com.willen.restapiwithmongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.willen.restapiwithmongodb.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

    // Consulta com método personalizado
    @Query("{'title': { $regex: ?0, $options: 'i'}}")
    List<Post> searchTitle(String text);

    List<Post> findByTitleContainingIgnoreCase(String text);
}
