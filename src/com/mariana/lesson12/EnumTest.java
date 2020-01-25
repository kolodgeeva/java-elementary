package com.mariana.lesson12;

import static com.mariana.lesson12.Apple.GoldenDel;
import static com.mariana.lesson12.Apple.RedDel;

public class EnumTest {

    public static void main(String[] args) {

        Apple apple = Apple.valueOf("RedDel");

        Apple apple1 = Apple.JONATHAN;


        switch (apple) {
            case RedDel:
                System.out.println(String.format("%s - %d - %s",
                        apple.toString(),
                        apple.getPrice(),
                        apple.getColor()));
                break;
            case JONATHAN:
                System.out.println(apple.toString());
                break;
            case GoldenDel:
                System.out.println(apple.toString());
                break;
        }

    }

}
