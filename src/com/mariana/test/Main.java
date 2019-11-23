package com.mariana.test;

public class Main {

    public static void main(String[] args) {
        Train train = new Train("blue", 4045, 1000 ,4,3);
        train.draw();
        System.out.println();

        System.out.println("-------------");

        Airplane plane = new Airplane("white", 170, 76,19, 6);
        plane.draw();

        System.out.println(train);
        System.out.println(plane);

    }
}
