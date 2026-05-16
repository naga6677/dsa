package com.dsa._01.maths;

public class CountDigits {

    public static void main(String args[]) {
        int count = 0;
        int numberCount = 798666;

        while(numberCount > 0) {

            numberCount = numberCount/10;
            count = count + 1;
        }

        System.out.println("The Length of the Elements in the Number is: " + count);

    }
}