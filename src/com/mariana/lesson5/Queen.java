package com.mariana.lesson5;

public class Queen extends AbstractChessItem {

    public Queen() {
        System.out.println("Queen()");
    }

    public Queen(int x, int y) {
        super(x, y);
        System.out.println("Queen(int x, int y)");
    }

    public Queen(int x, int y, int value) {
        super(x, y, value);
        System.out.println("Queen(int x, int y, int value)");
    }

    @Override
    public void draw() {
        System.out.println("draw queen");
    }

}
