package com.mariana.lesson9;

public class ThreadJoinTest {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("thread main start");

        MyThread thread1 = new MyThread("myThreadOne");
        thread1.start();

        Thread thread2 = new Thread(new MyThreadRunnable());
        thread2.start();

        System.out.println("thread main after start threads");

        thread1.join();

        System.out.println(String.format("thread %s joined", thread1.getName()));
    }

}
