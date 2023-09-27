package com.egencia.demo.reactiveprogrammingdemo.controller;

import com.egencia.demo.reactiveprogrammingdemo.model.User;
import com.egencia.demo.reactiveprogrammingdemo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
public class UserController {

    private final UserService userService;


    UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/user/{userId}")
    public Mono<User> getUser(@PathVariable String userId){

        System.out.println("First" + Thread.currentThread().getId()+" "+ Thread.currentThread().getName());
        Mono<User> user =  userService.getUser(userId);
        System.out.println("Fourth "+Thread.currentThread().getId()+" "+ Thread.currentThread().getName());
        return user;

    }

    @GetMapping("/user/api/{userId}")
    public Mono<User> getUserThroughAPI(@PathVariable String userId){

        return userService.getUserThroughAPI(userId);
    }

    @GetMapping("/del/user/{userId}")
    public Mono<String > removeUser(@PathVariable String userId){

        return userService.removeUser(userId);
    }

    @GetMapping(value = "/addUser")
    public Flux<User> addUser(){

        return userService.addUsers();

    }


}
