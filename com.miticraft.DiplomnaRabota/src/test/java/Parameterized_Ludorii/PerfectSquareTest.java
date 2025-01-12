package Parameterized_Ludorii;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PerfectSquareTest {
    private final Integer inputNumber;
    private final Boolean expectedResult;
    private PerfectSquareChecker perfectSquareChecker;

    @Before
    public void initialize() {
        perfectSquareChecker = new PerfectSquareChecker();
    }

    public PerfectSquareTest(Integer inputNumber, Boolean expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection perfectSquareNumbers() {
        return Arrays.asList(new Object[][]{
            {4, true},    // 4 = 2^2 (perfect square)
            {9, true},    // 9 = 3^2 (perfect square)
            {10, false},  // Not a perfect square
            {16, true},   // 16 = 4^2 (perfect square)
            {-1, false}   // Negative numbers are not perfect squares
        });
    }

    @Test
    public void testPerfectSquareChecker() {
        System.out.println("Param.Number is: " + inputNumber + " validate is = " + expectedResult);
        assertEquals(expectedResult, perfectSquareChecker.isPerfectSquare(inputNumber));
    }
}

