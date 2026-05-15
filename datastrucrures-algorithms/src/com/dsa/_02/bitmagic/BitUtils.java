package com.dsa._02.bitmagic;

public final class BitUtils {
    private BitUtils() {}

    public static int countSetBits(int x) { return Integer.bitCount(x); }
    public static boolean isPowerOfTwo(int x) { return x > 0 && (x & (x - 1)) == 0; }
    public static int highestPowerOfTwo(int x) { if (x < 1) return 0; return Integer.highestOneBit(x); }
    public static int lowestSetBit(int x) { if (x == 0) return 0; return x & -x; }
    public static int reverseBits(int x) { return Integer.reverse(x); }
    public static int setBit(int x, int pos) { return x | (1 << pos); }
    public static int clearBit(int x, int pos) { return x & ~(1 << pos); }
    public static int toggleBit(int x, int pos) { return x ^ (1 << pos); }
    public static boolean getBit(int x, int pos) { return ((x >>> pos) & 1) == 1; }
    public static void xorSwap(int[] arr, int i, int j) { if (arr==null) throw new NullPointerException("arr"); if (i==j) return; arr[i]^=arr[j]; arr[j]^=arr[i]; arr[i]^=arr[j]; }
}

