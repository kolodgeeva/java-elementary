package com.mariana.lesson10;

public class AssertTest {

    static int value = 3;

    static int getValue() {
        return value--;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            int n = getValue();

            assert n > 0: "n отрицательное!";

            System.out.println(n);

        }

    }

}
