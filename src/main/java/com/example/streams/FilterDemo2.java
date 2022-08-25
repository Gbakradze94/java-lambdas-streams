package com.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterDemo2 {
    public static void main(String[] args) {
        String[] names = { "Amanda", "Mandy", "James", "Monica", "Josh", "Nick" };
        List<String> namesList = new ArrayList<>(Arrays.asList(names));

        Predicate<String> startsWithM = name -> name.startsWith("M");

        List<String> startsWithMFiltered = namesList.stream()
                .filter(startsWithM)
                .collect(Collectors.toList());
        System.out.println(startsWithMFiltered);
    }
}
