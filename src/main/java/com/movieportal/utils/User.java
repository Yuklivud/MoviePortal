package com.movieportal.utils;

public class User {
    private int id;
    private String name;
    private String email;
    private Character password;

    public User(int id, String name, String email, Character password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Character getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }
}
