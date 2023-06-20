package com.willen.restapiwithmongodb.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.willen.restapiwithmongodb.domain.User;
import com.willen.restapiwithmongodb.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        // responseentity: possui recursos mais adequados para uma resposta rest

        List<User> list = service.findall();
        return ResponseEntity.ok().body(list);
    }
}
