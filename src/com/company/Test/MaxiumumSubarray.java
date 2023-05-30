package com.company.Test;

import com.company.Top100.Medium.MaximumSubarray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxiumumSubarray {

    @Test
    public  void test_01(){
        Assertions.assertEquals(6, MaximumSubarray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        Assertions.assertEquals(23, MaximumSubarray.maxSubArray(new int[]{5,4,-1,7,8}));
    }
}
