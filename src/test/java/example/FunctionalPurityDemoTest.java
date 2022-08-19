package example;


import com.example.FunctionalPurityDemo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * This test shows that the method called notPure() is not a pure function, because
 * on different calls it returns different results.
 * This is the result of having a setter method for the number field.
 * using setter, we can change state of an object and set the number value to 3.
 * This violates the principle of functional purity
 */
class FunctionalPurityDemoTest {

    @Test
    void testNotPure() {
        FunctionalPurityDemo demo = new FunctionalPurityDemo();
        int resultOnFirstCall = demo.notPure();
        demo.setNumber(3);
        int resultOnSecondCall = demo.notPure();

        Assertions.assertNotEquals(resultOnFirstCall, resultOnSecondCall);
    }
}
