package com.mariana.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStream {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");

        list.stream()
                .filter(number -> number.equals("Nine"))
                .forEach(System.out::println);

        IntStream.of(50, 60, 70, 80, 90, 100, 110, 120)
                .filter(number -> number < 90)
                .map(number -> number + 10)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("-----------------");

        String[] array = {"Java", "Course", "Gradle"};
        Stream<String> streamOfArray = Arrays.stream(array);
        final List<String> collect = streamOfArray.map(s -> s.split("")) //Преобразование слова в массив букв
                .flatMap(Arrays::stream) //выравнивает каждый сгенерированный поток в один поток
                .distinct()
                .collect(Collectors.toList());

        collect.forEach(System.out::println);

        System.out.println("----------------------");
        Arrays.stream(array)
                .map(s -> s.split("")) //Преобразование слова в массив букв
                .map(Arrays::stream)
                .distinct() //Сделать массив в отдельный поток
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("----------------------");
        Stream.of(2, 3, 0, 1, 3)
                .flatMapToInt(x -> IntStream.range(0, x))
                .forEach(System.out::print);// 010120012

        System.out.println("----------------------");
        Stream.of(2, 3, 0, 1, 3)
                .map(x -> IntStream.range(0, x))
                .forEach(System.out::print);//перечень стримов(потоков);


        System.out.println("----------------");
        int sum = Stream.of(1, 2, 3, 4, 5)
                .reduce(0, (acc, x) -> acc + x);//0 + 1 + 2 +3 + 4 = 20

        int sum2 = Stream.of(1, 2, 3, 4, 5)
                .reduce((acc, x) -> acc + x)
                .orElse(0);
    }

}
