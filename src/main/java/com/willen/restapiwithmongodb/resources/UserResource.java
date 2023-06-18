package com.willen.restapiwithmongodb.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.willen.restapiwithmongodb.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    // responseentity: possui recursos mais adequados para uma resposta rest
    public ResponseEntity<List<User>> findAll() {
        User maria = new User("1", "Maria green", "maria.email.com");
        User bob = new User("2", "Bob Brown", "bob.email.com");

        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(maria, bob));

        return ResponseEntity.ok().body(list);
    }
}
