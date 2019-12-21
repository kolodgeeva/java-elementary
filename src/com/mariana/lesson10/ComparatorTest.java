package com.mariana.lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

    public static void main(String[] args) {

        String[] array1 = {"мама", "мыла", "раму"};
        String[] array2 = {"я", "очень", "люблю", "java"};
        String[] array3 = {"мир", "труд"};

        List<String[]> arrays = new ArrayList<>();
        arrays.add(array1);
        arrays.add(array2);
        arrays.add(array3);

        arrays.sort((o1, o2) -> o1.length - o2.length);
        arrays.forEach(arr -> Arrays.asList(arr).forEach(System.out::println));
    }


}
