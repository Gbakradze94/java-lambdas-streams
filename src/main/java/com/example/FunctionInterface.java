package com.example;


import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
        Function<Integer, Integer> squareFunction = (Integer x) -> x * x;
        squareFunction.apply(2);
    }
}
