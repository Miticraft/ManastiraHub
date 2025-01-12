package Parameterized_Ludorii;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FibonacciTest {
    private final Integer inputNumber;
    private final Boolean expectedResult;
    private FibonacciChecker fibonacciChecker;

    @Before
    public void initialize() {
        fibonacciChecker = new FibonacciChecker();
    }

    public FibonacciTest(Integer inputNumber, Boolean expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection fibonacciNumbers() {
        return Arrays.asList(new Object[][]{
            {0, true},   // Part of Fibonacci sequence
            {1, true},   // Part of Fibonacci sequence
            {2, true},   // Part of Fibonacci sequence
            {3, true},   // Part of Fibonacci sequence
            {4, false},  // Not part of Fibonacci sequence
            {5, true},   // Part of Fibonacci sequence
            {8, true},   // Part of Fibonacci sequence
            {13, true},  // Part of Fibonacci sequence
            {21, true},  // Part of Fibonacci sequence
            {22, false}  // Not part of Fibonacci sequence
        });
    }

    @Test
    public void testFibonacciChecker() {
        System.out.println("Param.Number is: " + inputNumber + " validate is = " + expectedResult);
        assertEquals(expectedResult, fibonacciChecker.validate(inputNumber));
    }
}