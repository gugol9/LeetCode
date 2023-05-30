package com.company.Math;

import java.util.ArrayList;
import java.util.List;

public class MultiplyStrings {
    public  static String multiply(String num1, String num2) {


        List<String> list = new ArrayList<>();
        list.add(num1);
        list.add(num2);

        long result =
                list.stream()
                        .mapToLong(Long::parseLong)
                        .reduce(1,(a,b) -> a * b);

        return String.valueOf(result);

    }
}
