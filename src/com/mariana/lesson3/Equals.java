package com.mariana.lesson3;

public class Equals {

    public static void main(String[] args) {

        Cat cat = new Cat("test", 1);
        Cat cat1 = new Cat("test", 2);
        Cat cat2 = cat1;

        System.out.println(cat);
        System.out.println(cat1);

        if (cat.equals(cat1)) {
            System.out.println("cat = cat 1");
        } else {
            System.out.println("cat != cat 1");
        }

        cat1.fight(cat);

        System.out.println(cat);
        System.out.println(cat1);

        int num = 100;
        System.out.println("main " + num);
        changeNumber(num);
        System.out.println("main " + num);

    }


    public static void changeNumber(int number) {
        System.out.println("changeNumber " + number);
        number = 123;
        System.out.println("changeNumber " + number);
    }

    public static class Dog {

    }

    public class Duck {

    }

}
