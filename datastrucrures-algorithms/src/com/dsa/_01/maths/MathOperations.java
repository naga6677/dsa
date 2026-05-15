package com.dsa._01.maths;

public final class MathOperations {
    private MathOperations() {}

    public static long gcd(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public static long factorial(int n) {
        if (n < 0) return -1;
        long res = 1L;
        for (int i = 2; i <= n; i++) res *= i;
        return res;
    }

    public static long pow(long base, int exp) {
        if (exp < 0) throw new IllegalArgumentException("Negative exponent not supported");
        long r = 1L;
        while (exp > 0) {
            if ((exp & 1) == 1) r *= base;
            base *= base;
            exp >>= 1;
        }
        return r;
    }
}

