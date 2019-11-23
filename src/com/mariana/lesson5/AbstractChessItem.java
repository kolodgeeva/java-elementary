package com.mariana.lesson5;

public abstract class AbstractChessItem implements Drawable, Element {

    private int x;
    private int y;
    private int value;

    protected AbstractChessItem() {
        System.out.println("AbstractChessItem()");
    }

    public AbstractChessItem(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("AbstractChessItem(int x, int y)");
    }

    public AbstractChessItem(int x, int y, int value) {
        this.x = x;
        this.y = y;
        this.value = value;
        System.out.println("AbstractChessItem(int x, int y, int value)");
    }

    @Override
    public int getValue() {
        return this.value;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }
}
