package com.mariana.lesson9;

public class MyThreadRunnable implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (i < 5) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("MyThreadRunnable run " + i);
            i++;
        }
    }
}
