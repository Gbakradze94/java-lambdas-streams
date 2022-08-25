package com.example.advanced;

import java.util.function.BiFunction;
import java.util.function.Function;

public class PartialApplication {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> add =
                (x, y, z) -> x + y + z;

        Function<Integer, BiFunction<Integer, Integer, Integer>> addPartial =
                (x) -> (y, z) -> add.apply(x, y, z);

        BiFunction<Integer, Integer, Integer> add2 = addPartial.apply(2);

        System.out.println(add2.apply(3, 4));


       // Function<Integer, Integer> add2And3 = addPartial.apply(2, 3);
      //  System.out.println(add2And3.apply(4));
    }
}
