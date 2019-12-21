package com.mariana.lesson10;

public class PredicateTest {

    public static void main(String[] args) {

        printPredicate(integer -> integer > 5, 4);
    }

    public static void printPredicate(IntegerBiggerThanZeroPredicate predicate, Integer integer) {
        System.out.println(predicate.test(integer));
    }

}
