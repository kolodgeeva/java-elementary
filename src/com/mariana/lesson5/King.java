package com.mariana.lesson5;

public class King extends AbstractChessItem {

    public King() {
        System.out.println("King()");
    }

    public King(int x, int y) {
        super(x, y);
        System.out.println("King(int x, int y)");
    }

    public King(int x, int y, int value) {
        super(x, y, value);
        System.out.println("King(int x, int y, int value)");
    }

    @Override
    public void draw() {
        System.out.println("draw king");
    }

}
