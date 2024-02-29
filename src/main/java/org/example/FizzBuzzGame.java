package org.example;

public class FizzBuzzGame {
    public static String play(int n) {
        if (n % 3 == 0 && n % 5 == 0)
            return "FizzBuzz";
        else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";

        } else {
            return String.valueOf(n);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(play(i));
        }
    }
}
