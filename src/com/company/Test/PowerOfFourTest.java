package com.company.Test;

import com.company.Math.PowerOfFour;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowerOfFourTest {

    @Test
    public void test_01(){
        Assertions.assertTrue(PowerOfFour.isPowerOfFour(16));
        Assertions.assertTrue(PowerOfFour.isPowerOfFour(1));
        Assertions.assertTrue(PowerOfFour.isPowerOfFour(64));
        Assertions.assertFalse(PowerOfFour.isPowerOfFour(5));
    }
}
