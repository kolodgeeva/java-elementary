package com.mariana.lesson12;

import java.io.*;

public class Dog implements Externalizable {

    private static final long serialVersionUID = 1L;

    private String name;

    transient private int age;

    private int weight;

    private Passport passport;

    public Dog() {
    }

    public Dog(String name, int age, int weight, Passport passport) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", passport=" + passport +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject("new " + name);
        out.writeInt(age);
        out.writeInt(weight);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        age = in.readInt();
        weight = in.readInt();
    }
}
