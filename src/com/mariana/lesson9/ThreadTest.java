package com.mariana.lesson9;

public class ThreadTest {

    public static void main(String[] args) {

        System.out.println("thread main start");

        MyThread thread = new MyThread("myThreadOne");
        thread.start();

        MyThread thread1 = new MyThread("myThreadTwo");
        thread1.start();

        System.out.println("thread main after start MyThread");

        MyThreadRunnable myThreadRunnable = new MyThreadRunnable();

        Thread runnable = new Thread(myThreadRunnable);
        runnable.start();

        Thread runnable2 = new Thread(myThreadRunnable);
        runnable2.start();

        Thread runnable3 = new Thread(myThreadRunnable);
        runnable3.start();

        System.out.println("thread main after start MyThreadRunnable");

    }
}
