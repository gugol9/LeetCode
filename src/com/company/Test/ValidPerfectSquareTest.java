package com.company.Test;

import com.company.Math.ValidPerfectSquare;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidPerfectSquareTest {

    @Test
    public void test_01(){
        Assertions.assertTrue(ValidPerfectSquare.isPerfectSquare(16));
        Assertions.assertFalse(ValidPerfectSquare.isPerfectSquare(14));
    }
}
