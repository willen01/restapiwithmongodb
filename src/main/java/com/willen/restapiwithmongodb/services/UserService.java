package com.willen.restapiwithmongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.willen.restapiwithmongodb.domain.User;
import com.willen.restapiwithmongodb.dto.UserDTO;
import com.willen.restapiwithmongodb.repository.UserRepository;
import com.willen.restapiwithmongodb.services.exception.ObjectNotFoundException;

@Service
public class UserService {

    @Autowired // injeção de dependência automática do spring
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        Optional<User> user = repo.findById(id);
        System.out.println(user);
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User obj) {
        return repo.insert(obj);
    }

    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}
