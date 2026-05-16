package com.dsa._01.maths;

public class NumberPalindrome {

    public static void main(String[] args) {
        int number = 78987;
        int reverseNumber = 0;
        int temp = number;
        while(temp > 0){

           int tempNumber = temp % 10;
            reverseNumber = reverseNumber * 10 + tempNumber;
            temp = temp / 10;

        }

        if(number == reverseNumber){
            System.out.println("Palindrome");

        }else {
            System.out.println("Not Palindrome");
        }

    }
}
