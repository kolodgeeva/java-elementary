package com.mariana.lesson3;

public class AnyClass {

    public static void main(String[] args) {


        Cat cat = new Cat();
        cat.setName("new name");

        Cat cat1 = new Cat("some name");

        Cat cat2 = new Cat(Cat.DEFAULT_NAME);

        System.out.println(cat);
        System.out.println(cat1);
        System.out.println(cat2);

        System.out.println(new StringBuffer()
                .append("Car count: ")
                .append(Cat.getCatCount()));
    }
}
