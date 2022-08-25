package com.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterDemo {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5, 6};
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(integers));

        Predicate<Integer> filterEven = (x) -> x % 2 == 0;

        List<Integer> evenIntegers = listOfIntegers.stream()
                                                .filter(filterEven)
                                                //.filter(x -> x % 2 == 0)
                                                .collect(Collectors.toList());
        System.out.println(evenIntegers);

    }

    public List<Integer> filterEvenIntegersProcedural(List<Integer> integers) {
        List<Integer> evenIntegers = new ArrayList<>();
        for (Integer integer : integers) {
            boolean isEven = integer % 2 == 0;
            if (isEven) {
                evenIntegers.add(integer);
            }
        }
        return evenIntegers;
    }
}
