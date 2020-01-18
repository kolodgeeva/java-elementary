package com.mariana.lesson12;

import java.io.Serializable;

public class Cat implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    transient private int age;

    private int weight;

    private Passport passport;

    public Cat() {
    }

    public Cat(String name, int age, int weight, Passport passport) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", passport=" + passport +
                '}';
    }
}
