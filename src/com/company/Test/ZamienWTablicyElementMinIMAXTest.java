package com.company.Test;

import com.company.ZadaniaKsiazka.ReplaceMinMaxElementInArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZamienWTablicyElementMinIMAXTest {

    @Test
    public void test_minElement(){
        Assertions.assertEquals(0, ReplaceMinMaxElementInArray.findMinElement( new int[]{1,2,3,4,5}));
        Assertions.assertEquals(0, ReplaceMinMaxElementInArray.findMinElement( new int[]{-141,2,3,4,5}));
        Assertions.assertEquals(3, ReplaceMinMaxElementInArray.findMinElement( new int[]{1,2,3,0,5}));
    }

    @Test
    public void test_maxValue(){
        Assertions.assertEquals(2, ReplaceMinMaxElementInArray.findMaxElement(new int[]{1,44,55,8,-666,44,11,0}));
        Assertions.assertEquals(4, ReplaceMinMaxElementInArray.findMaxElement(new int[]{1,44,55,8,666,44,11,0}));
        Assertions.assertEquals(7, ReplaceMinMaxElementInArray.findMaxElement(new int[]{1,44,55,8,-666,44,11,1000000}));
        Assertions.assertEquals(0, ReplaceMinMaxElementInArray.findMaxElement(new int[]{999991,44,55,8,-666,44,11}));
    }

    @Test
    public void test_swap(){

        int[] arr = {1,2,3,4,5};
        int[] expected = {5,2,3,4,1};

        ReplaceMinMaxElementInArray.swap(arr,4,0);
        Assertions.assertArrayEquals(expected, arr);
    }
}
