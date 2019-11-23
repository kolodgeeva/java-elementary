package com.mariana.lesson4;

public abstract class Shape {

    protected String color;
    private int size;

    public Shape() {

    }

    public Shape(String color) {
        this.color = color;
    }

    public void draw() {
        this.drawShape();
    }

    public void fill() {
        System.out.println("Fill " + this.color);
    }

    private void drawShape() {
        System.out.println("Draw logic for any shape");
        System.out.println("Play music");
    }

}
