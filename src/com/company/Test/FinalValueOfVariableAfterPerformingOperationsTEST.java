package com.company.Test;

import com.company.Arrays.FinalValueOfVariableAfterPerformingOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinalValueOfVariableAfterPerformingOperationsTEST {

    @Test
    public void test_01(){
        Assertions.assertEquals(1, FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(new String[]{"--X","X++","X++"}));
        Assertions.assertEquals(2, FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(new String[]{"++X","X++"}));
        Assertions.assertEquals(-2, FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(new String[]{"--X","X--",}));
        Assertions.assertEquals(1, FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(new String[]{"X--","X++","X++"}));
    }
}
