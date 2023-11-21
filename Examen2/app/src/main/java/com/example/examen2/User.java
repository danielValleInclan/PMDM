package com.example.examen2;

public class User {
    private String name;
    private String passw;

    public User(String name, String passw) {
        this.name = name;
        this.passw = passw;
    }

    public String getName() {
        return name;
    }

    public String getPassw() {
        return passw;
    }
}
