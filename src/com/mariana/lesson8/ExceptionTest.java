package com.mariana.lesson8;

public class ExceptionTest {

    public static void main(String[] args) {

        try {
            method1();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Do not allow divide by zero " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Do not use index bigger than length " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Some error " + e.getMessage());
        }
        method2();

    }

    public static void method1() {

        //int a = 10 / 0;

        int[] arr = new int[10];

        int b = arr[20];

        //System.out.println(a);
    }

    public static void method2() {
        System.out.println("Everything is good!");
    }




}
