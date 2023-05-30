package com.company.Arrays;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FinalValueOfVariableAfterPerformingOperations {
    public static int finalValueAfterOperations(String[] operations) {



        Map<String,Integer> map = new HashMap<>();
        map.put("--X",-1);
        map.put("X--",-1);
        map.put("X++",1);
        map.put("++X",1);


int sum = 0;
        for (int i = 0; i < operations.length; i ++){
            if (map.containsKey(operations[i])){
                sum+= map.get(operations[i]);
            }
        }

        return sum;
    }
}

/*
Input: operations = ["--X","X++","X++"]
Output: 1
Explanation: The operations are performed as follows:
Initially, X = 0.
--X: X is decremented by 1, X =  0 - 1 = -1.
X++: X is incremented by 1, X = -1 + 1 =  0.
X++: X is incremented by 1, X =  0 + 1 =  1.
 */