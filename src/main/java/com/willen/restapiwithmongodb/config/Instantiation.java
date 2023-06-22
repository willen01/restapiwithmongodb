package com.willen.restapiwithmongodb.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.willen.restapiwithmongodb.domain.Post;
import com.willen.restapiwithmongodb.domain.User;
import com.willen.restapiwithmongodb.dto.AuthoDTO;
import com.willen.restapiwithmongodb.repository.PostRepository;
import com.willen.restapiwithmongodb.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        // Limpa coleção
        userRepository.deleteAll();
        postRepository.deleteAll();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        User maria = new User(null, "Maria Brown", "maria.brown@gmail.com");
        User alex = new User(null, "Alex Green", "alex.green@gmail.com");
        User bob = new User(null, "Bob Grey", "bob.grey@gmail.com");

        userRepository.saveAll(Arrays.asList(maria, alex, bob));

        Post post1 = new Post(null, sdf.parse("21/07/2023"), "Partiu viagem", "Vou viajar para são paulo. Abraços!",
                new AuthoDTO(maria));
        Post post2 = new Post(null, sdf.parse("23/07/2023"), "Bom dia", "Acordei feliz hoje!", new AuthoDTO(maria));

        postRepository.saveAll(Arrays.asList(post1, post2));

        maria.getPosts().addAll(Arrays.asList(post1, post2));
        userRepository.save(maria);
    }

} // Carga inicial de dados
