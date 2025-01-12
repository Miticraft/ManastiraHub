package Parameterized_Ludorii;

public class IrrationalNumberChecker {
    public boolean isIrrational(final Double number) {
        if (number.isNaN() || number.isInfinite() || number < 0) {
            return false; // Not irrational
        }

        double sqrt = Math.sqrt(number);
        return sqrt != Math.floor(sqrt); // True if sqrt is not an integer
    }
}
