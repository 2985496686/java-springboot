package com.guo.springboot02.entity;

public class User {

    private String name;

    private String email;

    private Pet pet;


    public User(String name, String email, Pet pet) {
        this.name = name;
        this.email = email;
        this.pet = pet;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Pet getPet() {
        return pet;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", pet=" + pet +
                '}';
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}