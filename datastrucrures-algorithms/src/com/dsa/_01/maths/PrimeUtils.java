package com.dsa._01.maths;

import java.util.ArrayList;
import java.util.List;

public final class PrimeUtils {
    private PrimeUtils() {}

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        int i = 5;
        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
            i += 6;
        }
        return true;
    }

    public static List<Integer> primesUpTo(int n) {
        List<Integer> out = new ArrayList<>();
        if (n < 2) return out;
        boolean[] sieve = new boolean[n + 1];
        java.util.Arrays.fill(sieve, true);
        sieve[0] = false; sieve[1] = false;
        for (int p = 2; p * p <= n; p++) {
            if (sieve[p]) {
                for (int q = p * p; q <= n; q += p) sieve[q] = false;
            }
        }
        for (int i = 2; i <= n; i++) if (sieve[i]) out.add(i);
        return out;
    }
}

