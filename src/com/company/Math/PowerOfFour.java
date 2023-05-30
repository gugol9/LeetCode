package com.company.Math;

public class PowerOfFour {
    public static boolean isPowerOfFour(int n) {

      //  return Math.log(n) / Math.log(4) % 1 == 0;

        if (n < 1) {
            return false;
        }

        while (n % 4 == 0) {
            n /= 4;
        }

        // bo na koncu przy dzieleniu wychodzi 1 a nie 0 temu MUSI BYC n == 1;
        return n == 1;
    }
}