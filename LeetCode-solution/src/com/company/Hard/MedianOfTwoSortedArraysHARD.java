package com.company.Hard;

import java.util.Arrays;

public class MedianOfTwoSortedArraysHARD {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int arr2len = nums1.length + nums2.length;
       int[] mergedArr = new int[arr2len];

       System.arraycopy(nums1,0,mergedArr,0,nums1.length);
       System.arraycopy(nums2,0,mergedArr,nums1.length,nums2.length);

       Arrays.sort(mergedArr);

        int middleElements = arr2len/2;


        if (mergedArr.length % 2 == 0){
           return (double) (mergedArr[middleElements-1] + mergedArr[middleElements])/2;
        }else return mergedArr[middleElements];


    }
}