package com.willen.restapiwithmongodb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.willen.restapiwithmongodb.domain.User;
import com.willen.restapiwithmongodb.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        // Limpa coleção
        userRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria.brown@gmail.com");
        User alex = new User(null, "Alex Green", "alex.green@gmail.com");
        User bob = new User(null, "Bob Grey", "bob.grey@gmail.com");

        userRepository.saveAll(Arrays.asList(maria, alex, bob));
    }

} // Carga inicial de dados
