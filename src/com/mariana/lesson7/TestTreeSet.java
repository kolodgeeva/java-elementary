package com.mariana.lesson7;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

    public static void main(String[] args) throws InterruptedException {

        Set<Order> orders = new TreeSet<>();

        Order order1 = new Order("test1", 2, 20.0, 40.0, 0.0);
        Thread.sleep(1000);
        Order order2 = new Order("test2", 2, 20.0, 40.0, 0.0);
        Thread.sleep(1000);
        Order order3 = new Order("test3", 2, 20.0, 40.0, 0.0);

        orders.add(order2);
        orders.add(order1);
        orders.add(order3);

        for(Order order: orders) {
            System.out.println(order);
        }

    }
}
