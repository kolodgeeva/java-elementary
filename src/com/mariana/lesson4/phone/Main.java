package com.mariana.lesson4.phone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String phoneName = reader.readLine();
        User user = new User();
        user.callToNumber(getPhone(phoneName), 111);
    }

    public static AbstractPhone getPhone(String phoneName) {
        if (phoneName.equals("conc")) {
            return new ConcretePhone(1989);
        } else if (phoneName.equals("smartik")){
            return new SmartPhone(2019);
        } else if (phoneName.equals("wireless")) {
            return new WirelessPhone(2018, 4);
        } else {
            throw new IllegalArgumentException("Unknown phone " + phoneName);
        }
    }
}
