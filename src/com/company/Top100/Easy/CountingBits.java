package com.company.Top100.Easy;

import java.util.Arrays;

public class CountingBits {
    public static int[] countBits(int n) {

        int[] arr = new int[n+1];
        int[] ans = new int[n+1];

        for (int i = 0; i < arr.length; i++){
            arr[i] = i;
            ans[i] = Integer.bitCount(arr[i]);
        }

        return ans;
    }
}

/*
Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10
Example 2:

//zlicza ile bitow jest w jednym arr[i] 11 to 2 bity
Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101
 */