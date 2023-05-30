package com.company.Test;

import com.company.Top100.Easy.CountingBits;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountingBitsTest {

    @Test
    public void test_01(){
        Assertions.assertArrayEquals(new int[]{0,1,1}, CountingBits.countBits(2));
        Assertions.assertEquals(new int[]{0,1,1,2,1,2}, CountingBits.countBits(5));
    }
}
