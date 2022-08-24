package example;

import com.example.LambdaExpressions;
import org.junit.jupiter.api.Test;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LambdaExpressionTest {

    LambdaExpressions expressions = new LambdaExpressions();

    @Test
    void testMyFunc() {
        Function<Integer, Integer> doubleFunc = expressions.myFunc;

        assertEquals(4, doubleFunc.apply(2));
    }

    @Test
    void testAnotherFunc() {
        Function<String, String> sayHello = expressions.anotherFunc;

        assertEquals("Hello Josh", sayHello.apply("Josh"));
    }

    @Test
    void testWordLengthCalculator() {
        Function<String, Integer> calculateLength = expressions.wordLengthCalculator;

        assertEquals(5, calculateLength.apply("Hello"));
    }
}
