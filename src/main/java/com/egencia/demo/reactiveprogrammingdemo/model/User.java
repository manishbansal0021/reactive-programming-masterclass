package com.egencia.demo.reactiveprogrammingdemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {

    @Id
    String id;
    String name;
    String roles;
    String preference;

    public User() {
    }

    public User(String id, String name, String roles, String preference) {
        this.id = id;
        this.name = name;
        this.roles = roles;
        this.preference = preference;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }
}
