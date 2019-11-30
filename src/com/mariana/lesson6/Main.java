package com.mariana.lesson6;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<User> someList = new ArrayList<User>();

        someList.add(new User("Mariana", 18));
        someList.add(new User("Alina", 20));
        someList.add(new User("Alina1", 20));
        someList.add(new User("Alina2", 20));
        someList.add(new User("Alina3", 20));
        someList.add(new User("Alina4", 20));
        someList.add(new User("Alina5", 20));
        someList.add(new User("Alina6", 20));
        someList.add(new User("Alina7", 20));
        someList.add(new User("Alina8", 20));
        someList.add(new User("Alina9", 20));

        User[] array = new User[15];

        for (int i = 0; i < someList.size(); i++) {
            array[i] = someList.get(i);
        }

        System.out.println("Print list");
        for (User user: someList) {
            System.out.print(user + " ");
        }

        System.out.println();
        System.out.println("Print array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        someList.add(4, new User("Vasia", 12));

        System.out.println();
        System.out.println("Print list after add by index");
        for (User user: someList) {
            System.out.print(user + " ");
        }

        array[4] = someList.get(4);

        System.out.println();
        System.out.println("Print array after add by index");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        someList.remove(4);
        System.out.println();
        System.out.println("Print list after remove by index");
        for (User user: someList) {
            System.out.print(user + " ");
        }

        array[4] = null;

        System.out.println();
        System.out.println("Print array after remove by index");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
