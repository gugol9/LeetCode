package com.company.Top100.Medium;

import java.util.*;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {



        if (nums.length == 0)return 0;
       nums =  Arrays.stream(nums).distinct().sorted().toArray();
        System.out.println(Arrays.toString(nums));
        int actual = 1;
        int max = 1;

        for (int i = 0; i < nums.length-1 ;i++){
            if(nums[i+1] - nums[i] == 1){
                actual++;
                if (actual > max){
                    max = actual;
                }
            }else actual = 1;
        }

        return max;
    }
}