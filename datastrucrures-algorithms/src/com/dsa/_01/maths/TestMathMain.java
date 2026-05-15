package com.dsa._01.maths;

public class TestMathMain {
    public static void main(String[] args) {
        System.out.println("Testing com.dsa._01.maths package");
        System.out.println("gcd(48,18) = " + MathOperations.gcd(48, 18));
        System.out.println("5! = " + MathOperations.factorial(5));
        System.out.println("2^10 = " + MathOperations.pow(2, 10));
        System.out.println("isPrime(17) = " + PrimeUtils.isPrime(17));
        System.out.println("primesUpTo(20) = " + PrimeUtils.primesUpTo(20));
    }
}

