package Sustezanie;

import java.util.Scanner;

public class Дневник_на_събития_или_Valid_Parentheses {
    public static Scanner Input = new Scanner(System.in);
    //Функция за валидизиране на скобите, използваща брояч.
    public static String Skobi(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else if (s.charAt(i) == ')') {
                count--;
            }
            if (count < 0) {
                return "Invalid";
            }
        }

        if (count == 0) {
            return "Valid";
        }
        return "Invalid";
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Input часта:
        int n = 0;
        do {
            n = Input.nextInt();
        } while (n < 0 || n > 100);
        String s[] = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = Input.next();
        }
        //Output часта:
        for (int i = 0; i < n; i++) {
            System.out.println(Skobi(s[i]));
        }
    }
}
