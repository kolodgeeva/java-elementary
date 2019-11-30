package com.mariana.lesson7;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        set.add("cat2");
        set.add("cat3");
        set.add("cat1");

        for (String ss: set) {
            System.out.println(ss);
        }

        set.remove("cat2");

        for (String ss: set) {
            System.out.println(ss);
        }

        System.out.println(set.contains("cat1"));
        System.out.println(set.contains("cat2"));

    }
}
