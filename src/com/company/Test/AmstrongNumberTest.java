package com.company.Test;

import com.company.Code.AmstrongNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AmstrongNumberTest {

    @Test
    public void test_01(){
        Assertions.assertTrue(AmstrongNumber.isAmstrongNumber(153));
        Assertions.assertTrue(AmstrongNumber.isAmstrongNumber(371));
        Assertions.assertTrue(AmstrongNumber.isAmstrongNumber(370));
        Assertions.assertTrue(AmstrongNumber.isAmstrongNumber(407));


    }
}
