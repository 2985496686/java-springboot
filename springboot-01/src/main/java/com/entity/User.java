package com.entity;


import org.springframework.validation.annotation.Validated;


public class User {
    private String name;


    private String eamil;
    private Pet pet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public User(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pet=" + pet +
                '}';
    }
}
