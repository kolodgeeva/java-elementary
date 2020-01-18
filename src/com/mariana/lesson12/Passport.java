package com.mariana.lesson12;

import java.io.Serializable;

public class Passport implements Serializable {

    private String id;

    public Passport() {
    }

    public Passport(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id='" + id + '\'' +
                '}';
    }
}
