package Parameterized_Ludorii;

public class FibonacciChecker {
    public boolean validate(final Integer number) {
        if (number < 0) return false;
        int a = 0, b = 1;
        while (a <= number) {
            if (a == number) return true;
            int temp = a + b;
            a = b;
            b = temp;
        }
        return false;
    }
}
