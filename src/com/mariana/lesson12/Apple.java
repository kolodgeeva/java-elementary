package com.mariana.lesson12;

public enum Apple {

    JONATHAN(10, "Jonathan"),
    GoldenDel(20, "black"),
    RedDel(30, "red"),
    Winesap(25, "white"),
    Cortland(11, "yellow");

    private int price;
    private String color;

    Apple(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}
