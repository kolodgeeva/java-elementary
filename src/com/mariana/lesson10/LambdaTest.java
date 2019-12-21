package com.mariana.lesson10;

import java.util.Arrays;
import java.util.List;

public class LambdaTest {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("a", "b", "c");

        for (String str: strings) {
            print(str);
        }

        strings.forEach(System.out::println);

        strings.forEach(str -> {

            if (str.equals("a")) {

            }

            System.out.println(str);
        });

    }


    public static void print(String str) {
        System.out.println(str);
    }
}
