package com.mariana.lesson9.clock;

import java.util.concurrent.Callable;

public class ClockCallable implements Callable<Integer> {

    private volatile boolean isCancel = false;

    private Integer tickCount = 0;

    @Override
    public Integer call() throws Exception {
        Thread thread = Thread.currentThread();
        while (!this.isCancel) {
            Thread.sleep(1000);
            System.out.println(thread.getName() + " Tick");
            tickCount++;
        }
        return tickCount;
    }

    public void cancel() {
        this.isCancel = true;
    }
}
