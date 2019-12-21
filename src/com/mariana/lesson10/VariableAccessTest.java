package com.mariana.lesson10;

import java.util.concurrent.atomic.AtomicInteger;

public class VariableAccessTest {

    public static void main(String[] args) {

        final AtomicInteger counter = new AtomicInteger(0);

        Runnable runnable = counter::incrementAndGet;


    }

}
