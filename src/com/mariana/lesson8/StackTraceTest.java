package com.mariana.lesson8;

import java.util.Arrays;

public class StackTraceTest {

    public static void main(String[] args) {
        method1();
        System.out.println();
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));

    }

    public static void method1() {
        method2();
        System.out.println();
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
    }

    public static void method2() {
        method3();
        System.out.println();
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
    }

    public static void method3() {
        method4();
        System.out.println();
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
    }

    public static void method4() {
        System.out.println();
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
    }

}
