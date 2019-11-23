package com.mariana.test;

public class Airplane extends Transport {

    public Airplane() {

    }
    public Airplane(String color, int weight, int length, int height, int width) {
        this.color = color;
        this.weight = weight;
        this.length = length;
        this.height = height;
        this.width = width;
    }
    @Override
    public void draw() {
        super.draw();
        System.out.println("Airplane is flying");
    }
}
