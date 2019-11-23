package com.mariana.lesson4.phone;

public abstract class AbstractPhone {

    private int year;

    public AbstractPhone() {

    }

    public AbstractPhone(int year) {
        this.year = year;
    }

    public abstract void ring(int inNumber);

    public abstract void call(int outNumber);
}
