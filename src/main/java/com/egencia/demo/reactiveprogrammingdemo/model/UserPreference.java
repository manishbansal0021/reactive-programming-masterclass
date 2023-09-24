package com.egencia.demo.reactiveprogrammingdemo.model;

public class UserPreference {

    String theme;
    String language;

    public UserPreference(String theme, String language) {
        this.theme = theme;
        this.language = language;
    }

    @Override
    public String toString() {
        return "UserPreference{" +
                "theme='" + theme + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
