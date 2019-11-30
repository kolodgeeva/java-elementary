package com.mariana.lesson7;

import java.util.Stack;

public class TestStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        System.out.println("empty " + stack.empty());

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("peek " + stack.peek());

        System.out.println("in stack after peek:");
        for (Integer integer: stack) {
            System.out.println(integer);
        }

        Integer number = stack.pop();
        System.out.println("pop " + number);

        System.out.println("in stack after pop:");
        for (Integer integer: stack) {
            System.out.println(integer);
        }

        System.out.println("pop " + stack.pop());

        System.out.println("in stack after pop:");
        for (Integer integer: stack) {
            System.out.println(integer);
        }
    }
}
