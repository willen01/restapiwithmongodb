package com.willen.restapiwithmongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.willen.restapiwithmongodb.domain.User;
import com.willen.restapiwithmongodb.repository.UserRepository;

@Service
public class UserService {

    @Autowired // injeção de dependência automática do spring
    private UserRepository repo;

    public List<User> findall() {
        return repo.findAll();
    }
}
