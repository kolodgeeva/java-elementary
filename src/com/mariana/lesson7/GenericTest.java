package com.mariana.lesson7;

public class GenericTest {

    public static void main(String[] args) {

        Order order1 = new Order("test1", 2, 20.0, 40.0, 0.0);
        print(order1);
        print("ttttt");
        print(123);
    }


    public static <T> void print(T arg) {
        System.out.println(arg);
    }

}
