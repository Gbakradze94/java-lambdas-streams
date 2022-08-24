package com.example;

import java.util.function.Function;

public class LambdaExpressions {
    public Function<Integer, Integer> myFunc = (Integer x) -> x * 2;

    //   Function<String, String> anotherFunc = (String name) -> "Hello " + name;

    public Function<String, String> anotherFunc = name -> "Hello " + name;

    public Function<String, Integer> wordLengthCalculator =
            (String word) -> {
                Integer numOfChars = word.length();
                return numOfChars;
            };

}
