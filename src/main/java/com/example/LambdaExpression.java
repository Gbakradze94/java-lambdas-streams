package com.example;

import java.util.function.Function;

public class LambdaExpression {
    public static void main(String[] args) {
        Function<String, String> greeting = (String name) -> "Hello " + name;
        String result = greeting.apply("Mary");
        System.out.println(result);

        Function<String, String> nameToLowerCase = name -> name.toLowerCase();
        System.out.println(nameToLowerCase.apply("MARY"));

        Function<String, Integer> getLength = name -> name.length();
        System.out.println(getLength.apply("Antonio"));

        // Lambda expression with multiple lines
        Function<Integer, Integer> makeItTriple = (Integer x) -> {
            Integer triple = x * 3;
            return triple;
        };
        System.out.println(makeItTriple.apply(3));
    }
}
