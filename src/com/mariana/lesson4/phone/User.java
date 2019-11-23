package com.mariana.lesson4.phone;

public class User {

    String name;
    int number;

    public void callToNumber(AbstractPhone phone, int number) {
        phone.call(number);
    }

}
