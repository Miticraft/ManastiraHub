package Parameterized_Ludorii;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class IrrationalNumberTest {
    private final Double inputNumber;
    private final Boolean expectedResult;
    private IrrationalNumberChecker irrationalNumberChecker;

    @Before
    public void initialize() {
        irrationalNumberChecker = new IrrationalNumberChecker();
    }

    public IrrationalNumberTest(Double inputNumber, Boolean expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection irrationalNumbers() {
        return Arrays.asList(new Object[][]{
            {2.0, true},   // √2 is irrational
            {4.0, false},  // √4 = 2 (not irrational)
            {9.0, false},  // √9 = 3 (not irrational)
            {10.0, true},  // √10 is irrational
            {-4.0, false}, // Negative square root is not irrational
            {Double.NaN, false},  // NaN is not irrational
            {Double.POSITIVE_INFINITY, false}, // Infinity is not irrational
        });
    }

    @Test
    public void testIrrationalNumberChecker() {
        System.out.println("Param.Number is: " + inputNumber + " validate is = " + expectedResult);
        assertEquals(expectedResult, irrationalNumberChecker.isIrrational(inputNumber));
    }
}

