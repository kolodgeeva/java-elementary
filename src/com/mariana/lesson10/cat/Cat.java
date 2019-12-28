package com.mariana.lesson10.cat;

public class Cat implements WithNameAndAge {

    private String name;

    private Integer age;

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
