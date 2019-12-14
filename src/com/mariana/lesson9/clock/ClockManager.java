package com.mariana.lesson9.clock;

import java.util.concurrent.*;

public class ClockManager {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        ClockCallable task1 = new ClockCallable();
        Future<Integer> future1 = executor.submit(task1);

        ClockCallable task2 = new ClockCallable();
        Future<Integer> future2 = executor.submit(task2);

        Thread.sleep(5000);

        task1.cancel();

        Integer integer = future1.get();
        System.out.println(integer);
    }

}
