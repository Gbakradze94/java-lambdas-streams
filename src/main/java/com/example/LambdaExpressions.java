package com.example;

import java.util.function.Function;

public class LambdaExpressions {
    public static void main(String[] args) {
        Function<Integer, Integer> myFunc = (Integer x) -> x * 2;

     //   Function<String, String> anotherFunc = (String name) -> "Hello " + name;

        Function<String, String> anotherFunc = name -> "Hello " + name;

        Function<String, Integer> wordLengthCalculator =
                (String word) -> {
                    Integer numOfChars = word.length();
                    String result = "String has " + numOfChars + " characters.";
                    return Integer.valueOf(result);
                };

    }
}
