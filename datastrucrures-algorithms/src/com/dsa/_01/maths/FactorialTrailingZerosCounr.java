package com.dsa._01.maths;

public class FactorialTrailingZerosCounr {

    public static void main(String[] args) {
    factorialTrailingZeros(100);

    }

    private static void factorialTrailingZeros(int number) {

        int trailingZeros = 0;
        for (int i =5; i<=number; i= i*5) {
            trailingZeros = trailingZeros + number / i;
        }
        System.out.println("The number of trailing zeros in the factorial of " + number + " is: " + trailingZeros);
    }
}
