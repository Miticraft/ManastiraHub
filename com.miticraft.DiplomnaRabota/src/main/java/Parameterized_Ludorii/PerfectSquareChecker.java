package Parameterized_Ludorii;

public class PerfectSquareChecker {
    public boolean isPerfectSquare(final Integer number) {
        if (number < 0) return false;
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }
}

