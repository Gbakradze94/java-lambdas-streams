package com.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * In this demo, we create square function and pass it to another function named map(),
 * which is an intermediate operation.
 */
public class StreamExample3 {
    public static void main(String[] args) {
        Integer[] numbers = { 1, 2, 3, 4, 5, 6 };
        List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(numbers));


        Function<Integer, Integer> square = x -> x * x;

        List<Integer> squaredNumbers = listOfNumbers.stream()
                .map(square)
                .collect(Collectors.toList());
        System.out.println(squaredNumbers);
    }
}
