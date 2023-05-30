package com.company.Top100.Medium;

import java.util.Arrays;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {

      return Arrays.stream(nums).min().orElse(-1);

    }
}