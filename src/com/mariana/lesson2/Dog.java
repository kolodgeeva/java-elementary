package com.mariana.lesson2;

public class Dog {

    static int COUNT;

    String name;
    int age;

    public Dog() {
        COUNT++;
    }

    public Dog(String name) {
        this.name = name;
        Dog.COUNT++;
    }

    public Dog(String name, int age) {
        this(name);
        this.age = age;
    }

    public void gav() {
        System.out.println("gav! " + this.name);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
