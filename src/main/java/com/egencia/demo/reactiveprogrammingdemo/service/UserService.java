package com.egencia.demo.reactiveprogrammingdemo.service;

import com.egencia.demo.reactiveprogrammingdemo.model.User;
import com.egencia.demo.reactiveprogrammingdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public Flux<User> addUsers() {

        List<User> userList = new ArrayList<>();

        for(int i=1;i<500;i++){
            userList.add(new User(i+"","test_user"+i,"admin","test"));
        }

        return userRepository.saveAll(userList);


    }

    public Mono<User> getUser(String userId) {

        System.out.println("Second"+Thread.currentThread().getId()+" "+ Thread.currentThread().getName());
        Mono<User> user =  userRepository.findById(userId);

        System.out.println("Third"+Thread.currentThread().getId()+" "+ Thread.currentThread().getName());
        return user;

    }

    public Mono<String > removeUser(String userId) {

        userRepository.deleteById(userId).subscribe();
        return Mono.just("user deleted");

    }

    public Mono<User> getUserThroughAPI(String userId) {

        WebClient webClient = WebClient.create("http://localhost:8080");

         return webClient.get()
                .uri("/user/{userId}", userId)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                 .bodyToMono(User.class);

    }


    public User getUSer(String userId) {
        return new User();
    }
}
