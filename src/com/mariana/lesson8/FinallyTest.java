package com.mariana.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyTest {

    public static void main(String[] args) {

        try {
            System.out.println("method1 before");
            method1();
            System.out.println("method1 after");
        } catch (Exception e) {
            System.out.println("catch exception");
            e.printStackTrace();
        } finally {
            System.out.println("finish");
        }

    }

    public static void method1() throws Exception {
        //throw new Exception("method 1 exception");
    }





}
