package com.company.Top100.Medium;

import java.util.Arrays;
@Deprecated
//podzielic zbior na dwie czesci tak aby ich sumy byly rowne
public class PartitionEqualSubsetSum {
    public  static  boolean canPartition(int[] nums) {


        int sum = Arrays.stream(nums).sum();



        System.out.println(sum);
        //suma parzysta
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length ;j++){
                if (sum-nums[i] == sum-nums[j]){
                    return true;
                }
            }
        }
return false;
    }
}