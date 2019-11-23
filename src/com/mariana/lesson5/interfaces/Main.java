package com.mariana.lesson5.interfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (!(s = reader.readLine()).equals("")) {
            final int type = Integer.parseInt(s);
            Creature creature = createCreature(type);
            makeActions(creature);
        }
    }

    private static Creature createCreature(final int type) {
        switch (type) {
            case 1:
                return new Human();
            case 2:
                return new Fish();
            default:
                throw new IllegalArgumentException("Unknown creature type");
        }
    }

    private static void callFly(Flyable flyable) {
        flyable.fly();
    }

    private static void callRun(Runnable runnable) {
        runnable.run();
    }

    private static void callSwim(Swimmable swimmable) {
        swimmable.swim();
    }

    private static void makeActions(Creature creature) {
        if (creature instanceof Swimmable) {
            callSwim((Swimmable) creature);
        }

        if (creature instanceof Runnable) {
            callRun((Runnable) creature);
        }

        if (creature instanceof Flyable) {
            callFly((Flyable) creature);
        }
    }

}
