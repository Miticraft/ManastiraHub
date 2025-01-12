package Parameterized_Ludorii;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ArmstrongTest {
    private final Integer inputNumber;
    private final Boolean expectedResult;
    private ArmstrongNumberChecker armstrongNumberChecker;

    @Before
    public void initialize() {
        armstrongNumberChecker = new ArmstrongNumberChecker();
    }

    public ArmstrongTest(Integer inputNumber, Boolean expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection armstrongNumbers() {
        return Arrays.asList(new Object[][]{
            {153, true},    // Armstrong number
            {9474, true},   // Armstrong number
            {123, false},   // Not an Armstrong number
            {0, true},      // Armstrong number (0^1 = 0)
            {9475, false}   // Not an Armstrong number
        });
    }

    @Test
    public void testArmstrongNumberChecker() {
        System.out.println("Param.Number is: " + inputNumber + " isArmstrong = " + expectedResult);
        assertEquals(expectedResult, armstrongNumberChecker.isArmstrong(inputNumber));
    }
}

