package com.egencia.demo.reactiveprogrammingdemo.controller;

import com.egencia.demo.reactiveprogrammingdemo.model.User;
import com.egencia.demo.reactiveprogrammingdemo.model.UserPreference;
import com.egencia.demo.reactiveprogrammingdemo.service.UserPreferenceService;
import com.egencia.demo.reactiveprogrammingdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;

@RestController
public class UserController {



    private final UserService userService;
    private final UserPreferenceService userPreferenceService;


    UserController(UserService userService, UserPreferenceService userPreferenceService){
        this.userService = userService;
        this.userPreferenceService = userPreferenceService;
    }

    @GetMapping("/user/{userId}")
    public Mono<User> getUser(@PathVariable String userId){

        System.out.println("First" + Thread.currentThread().getId()+" "+ Thread.currentThread().getName());
        Mono<User> user =  userService.getUser(userId);
        System.out.println("Fourth"+Thread.currentThread().getId()+" "+ Thread.currentThread().getName());
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

    @GetMapping("/addUser")
    public Mono<String> addUser(){

        return userService.addUsers();

    }






//    @GetMapping("/users/{userId}")
//    public User getUserDetails(@PathVariable String  userId){
//        User user = userService.getUSer(userId);
//
//        UserPreference userPreference = userPreferenceService.getPReferences(userId);
//
//        user.setPreference(userPreference.toString());
//        return user;
//
//    }





//    @GetMapping("/users/{userId}")
//    public User getUserDetails(@PathVariable String  userId) {
//
//        CompletableFuture<User> userAsync = CompletableFuture.supplyAsync(() -> userService.getUSer(userId));
//        CompletableFuture<UserPreference> userPreferenceAsync = CompletableFuture.supplyAsync(() -> userPreferenceService.getPReferences(userId));
//
//        CompletableFuture<Void> bothFutures = CompletableFuture.allOf(userAsync, userPreferenceAsync);
//        bothFutures.join();
//
//        User user = userAsync.join();
//
//        UserPreference userPreference = userPreferenceAsync.join();
//
//        user.setPreference(userPreference.toString());
//        return user;
//    }



    @GetMapping("/users/{userId}")
    public Mono<User> getUserDetails(@PathVariable String  userId){

        return userService.getUser(userId)
                .zipWith(userPreferenceService.getPreferences(userId))
                .map( tuple -> {
                    User user = tuple.getT1();
                    user.setPreference(tuple.getT2().toString());
                    return user;
                } );

    }

}
