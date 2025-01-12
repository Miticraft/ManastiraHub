package Parameterized_Ludorii;

public class ArmstrongNumberChecker {
    public boolean isArmstrong(final Integer number) {
        int sum = 0;
        int temp = number;
        int digits = String.valueOf(number).length();

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == number;
    }
}

