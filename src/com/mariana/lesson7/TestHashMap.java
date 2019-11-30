package com.mariana.lesson7;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestHashMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Maria", 10);
        map.put("Maria1", 10);
        map.put("Maria2", 10);
        map.put("Maria3", 10);
        map.put("Maria4", 10);
        map.put("Maria5", 10);
        map.put("Maria6", 10);
        map.put("Maria7", 10);
        map.put("Maria7", 20);

        map.forEach( (key, value) -> System.out.println(String.format("%s got %s", key, value)));

        System.out.println("_____________________");

//        for (Map.Entry<String, Integer> entry: map.entrySet()) {
//            System.out.println(String.format("%s got %s", entry.getKey(), entry.getValue()));
//        }

        System.out.println(map.get("Maria333"));

    }
}
