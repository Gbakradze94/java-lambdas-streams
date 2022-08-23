package com.example;

import java.util.function.Function;

public class MethodReference {
    static class Introduction {
        public static String sayHi(String name) {
            return "Hello " + name;
        }
    }

    public static void main(String[] args) {
        Function<String, String> greeting = FunctionInterface.Introduction::sayHi;
        System.out.println(greeting.apply("James"));
        System.out.println(greeting.apply("Scott"));
    }
}
