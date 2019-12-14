package com.mariana.lesson9;

import java.util.HashMap;
import java.util.Map;

public class TestStatic {

    public static Map<String, Integer> staticMap = new HashMap<>();

    static {
        staticMap.put("monday", 24);
        staticMap.put("thursday", 20);
        staticMap.put("saturday", 15);
        staticMap.put("sunday", 10);
        staticMap.put("wednesday", 24);
    }

    public static void main(String[] args) {
        System.out.println(staticMap.get("monday"));
    }

}
