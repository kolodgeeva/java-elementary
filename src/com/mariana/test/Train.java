package com.mariana.test;

public class Train extends Transport{

    public Train(){

    }

    public Train(String color, int weight, int length, int height, int width) {
        this.color = color;
        this.weight = weight;
        this.length = length;
        this.height = height;
        this.width = width;
    }
    @Override
    public void draw() {
        super.draw();
        System.out.println("Train is riding");
    }
}
