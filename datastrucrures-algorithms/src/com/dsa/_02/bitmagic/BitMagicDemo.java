package com.dsa._02.bitmagic;

public class BitMagicDemo {
    public static void main(String[] args) {
        System.out.println("BitMagicDemo — com.dsa._02.bitmagic");
        int x = 29;
        System.out.println("x = " + x + " (binary " + Integer.toBinaryString(x) + ")");
        System.out.println("countSetBits(x) = " + BitUtils.countSetBits(x));
        System.out.println("isPowerOfTwo(16) = " + BitUtils.isPowerOfTwo(16));
        System.out.println("highestPowerOfTwo(20) = " + BitUtils.highestPowerOfTwo(20));
        System.out.println("lowestSetBit(40) = " + BitUtils.lowestSetBit(40));
        int[] arr = {3,5,7};
        System.out.println("arr before xorSwap: " + java.util.Arrays.toString(arr));
        BitUtils.xorSwap(arr,0,2);
        System.out.println("arr after xorSwap(0,2): " + java.util.Arrays.toString(arr));
    }
}

