package com.company.Test;

import com.company.Arrays.CountEqualAndDivisiblePairsInAnArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountEqualAndDivisiblePairsInAnArrayTest {

    @Test
    public void test_01(){
        CountEqualAndDivisiblePairsInAnArray obj= new CountEqualAndDivisiblePairsInAnArray();

        Assertions.assertEquals(4, obj.countPairs(new int[]{3,1,2,2,2,1,3}, 2));
    }
}
