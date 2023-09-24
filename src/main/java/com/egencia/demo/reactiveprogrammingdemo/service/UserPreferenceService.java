package com.egencia.demo.reactiveprogrammingdemo.service;

import com.egencia.demo.reactiveprogrammingdemo.model.UserPreference;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserPreferenceService {

    public UserPreference getPReferences(String  userId) {

        return new UserPreference("dark","English");

    }

    public Mono<UserPreference> getPreferences(String  userId) {

        return Mono.just(new UserPreference("dark","English"));

    }
}
