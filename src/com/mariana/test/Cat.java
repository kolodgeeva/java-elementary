package com.mariana.test;



public class Cat {

    String name;
    int age;
    String color;
    int weight;

    public Cat(String name, int age, String color, int weight) {

        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public String toString() {
        return new StringBuilder("\n" + "name : ") + (this.name) +
                (", age : ") + (this.age) +
                (", color : ") + (this.color) +
                (", weight : ") + (this.weight) +
                (".");
    }
}
