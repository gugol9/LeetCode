package com.company.Binary;

public class HammingDistance {
    public static int hammingDistance(int x, int y) {

        return Integer.bitCount(x^y);
    }
}