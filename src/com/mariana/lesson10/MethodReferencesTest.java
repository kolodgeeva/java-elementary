package com.mariana.lesson10;

import com.mariana.lesson10.cat.Main;

import java.util.LinkedList;
import java.util.List;

public class MethodReferencesTest {

    public static void main(String[] args) {

        List<String> strings = new LinkedList<>();
        strings.add("мама");
        strings.add("мыла");
        strings.add("раму");

        strings.forEach(User::new);

        MethodReferencesTest test = new MethodReferencesTest();
        strings.forEach(test::nonStaticPrint);
    }

    static void staticPrint(String string) {
        System.out.println(string);
    }

    void nonStaticPrint(String string) {
        System.out.println(string);
    }

    public static class User {

        String name;

        public User() {
        }

        public User(String name) {
            this.name = name;

            System.out.println("user: " + this.name);
        }
    }
}
