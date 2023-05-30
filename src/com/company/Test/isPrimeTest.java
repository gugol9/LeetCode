package com.company.Test;

import com.company.Code.isPrime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class isPrimeTest {

    @Test
    public void test_01(){
        Assertions.assertTrue( isPrime.isPrime(2));
        Assertions.assertTrue( isPrime.isPrime(3));
        Assertions.assertFalse( isPrime.isPrime(27));
        Assertions.assertTrue( isPrime.isPrime(29));
        Assertions.assertTrue( isPrime.isPrime(41));
        Assertions.assertTrue( isPrime.isPrime(43));
        Assertions.assertFalse( isPrime.isPrime(42));
        Assertions.assertFalse( isPrime.isPrime(1));
        Assertions.assertFalse( isPrime.isPrime(4));
        Assertions.assertFalse( isPrime.isPrime(917));
        Assertions.assertFalse( isPrime.isPrime(4));
    }
}
