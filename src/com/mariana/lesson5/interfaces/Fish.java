package com.mariana.lesson5.interfaces;

public class Fish extends Creature implements Swimmable, Flyable {
    @Override
    public void fly() {
        System.out.println("fish is flying");
    }

    @Override
    public void swim() {
        System.out.println("fish is swimming");
    }
}
