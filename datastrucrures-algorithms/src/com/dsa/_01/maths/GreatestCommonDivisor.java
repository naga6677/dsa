package com.dsa._01.maths;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
int gcd = gcd(15,30);
System.out.println("The GCD is: "+gcd);

    }

    public static int gcd(int a, int b) {

        int result = a;
         if(a > b){
           result = b;
         }

         while(result > 0){
             if(a % result == 0 && (b % result) == 0){
                 break;
             }

             result--;
         }
        return result;
    }
}
