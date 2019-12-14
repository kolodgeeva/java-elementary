package com.mariana.lesson9.clock;

public class Clock implements Runnable {

    @Override
    public void run() {

        Thread thread = Thread.currentThread();
        while (!thread.isInterrupted()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
            System.out.println(thread.getName() + " Tick");
        }
    }
}
