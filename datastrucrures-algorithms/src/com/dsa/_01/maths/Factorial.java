package com.dsa._01.maths;

public class Factorial {

    public static void main(String[] args) {
        int number = 10;

        int factorial = factorial(number);
        System.out.println("The factorial is: "+factorial);
    }

    private static int factorial(int number) {

        if(number ==1) {
            return 1;
        }
        return number * factorial(number - 1);

    }
}
