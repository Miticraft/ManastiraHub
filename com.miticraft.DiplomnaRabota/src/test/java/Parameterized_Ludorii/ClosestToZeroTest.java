package Parameterized_Ludorii;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ClosestToZeroTest {
    private final int[] inputArray;
    private final int expectedResult;
    private ClosestToZeroFinder closestToZeroFinder;

    @Before
    public void initialize() {
        closestToZeroFinder = new ClosestToZeroFinder();
    }

    public ClosestToZeroTest(int[] inputArray, int expectedResult) {
        this.inputArray = inputArray;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection testCases() {
        return Arrays.asList(new Object[][]{
            {new int[]{-4, -2, 1, 4, 8}, 1},       // Closest is 1
            {new int[]{-3, -1, 2, 3, 5}, -1},      // Closest is -1
            {new int[]{0, 2, -2, 5}, 0},           // Closest is 0
            {new int[]{-5, -4, -3, -2}, -2},       // Closest is -2
            {new int[]{7, 3, -3, -7}, 3}           // Closest is 3
        });
    }

    @Test
    public void testFindClosestToZero() {
        System.out.println("Input Array: " + Arrays.toString(inputArray) + " Expected Closest to Zero: " + expectedResult);
        assertEquals(expectedResult, closestToZeroFinder.findClosestToZero(inputArray));
    }
}
