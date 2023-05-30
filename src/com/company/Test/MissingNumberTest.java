package com.company.Test;

import com.company.Top100.Easy.MissingNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingNumberTest {

    @Test
    public void test_01(){
        Assertions.assertEquals(2, MissingNumber.missingNumber(new int[]{3,0,1}));

    }
}
