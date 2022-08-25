package com.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 4.2 Ways to create a stream
 */
public class StreamExample2 {
    public static void main(String[] args) {
        Integer[] grades = new Integer[] { 59, 80, 77, 54, 45, 63 };
        Stream<Integer> gradesStream = Arrays.stream(grades);

        List<String> food = new ArrayList<>();
        food.add("Bread");
        food.add("Cheese");
        food.add("Butter");
        food.add("Cake");
        food.add("Sausage");

        Stream<String> foodStream = food.stream();
        foodStream.sorted()
                .forEach(item -> System.out.println(item));

        Stream<String> letterStream = Stream.of("a", "b", "c");
    }
}
