package org.example;

public class FizzBuzzGame {
    public static String play(int n) {
        if (n % 3 == 0 && n % 5 == 0)
            return "Fizz";
        else if (n%3==0) {
            return "Fizz";
        }
            else if (n%5==0) {
                return "Buzz";

        }
        return "";
    }

}
