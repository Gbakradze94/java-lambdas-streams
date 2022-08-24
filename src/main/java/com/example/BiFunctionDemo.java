package com.example;

import java.util.function.BiFunction;

public class BiFunctionDemo {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> multiply = (x, y) -> x * y;
        System.out.println(multiply.apply(2,3));
    }
}
