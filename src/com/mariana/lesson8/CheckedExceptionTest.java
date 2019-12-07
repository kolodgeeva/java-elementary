package com.mariana.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExceptionTest {

    public static void main(String[] args) {

        if (args == null || args.length <= 0) {
            throw new IllegalArgumentException("Should be run with args");
        }


        try {
            method1();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

    }

    public static void method1() {
        System.out.println("method1 start");
        try {
            method2();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("catch IOException", e);
        }
        System.out.println("method1 end");
    }

    public static void method2() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        throw new IOException("my io");
        //System.out.println(string);

    }




}
