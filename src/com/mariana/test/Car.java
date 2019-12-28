package com.mariana.test;

public class Car {
    public int weight;
    public String type;

    public Car(int weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                ", type='" + type + '\'' +
                '}';
    }
}
