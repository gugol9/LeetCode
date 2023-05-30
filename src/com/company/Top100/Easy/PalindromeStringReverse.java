package com.company.Top100.Easy;

public class PalindromeStringReverse {


    public static boolean isPalindrome(String s){

        //USUNAC ZNAKI INNE NIZ ALFANUMERYCZNE
        s= s.toLowerCase().replace(" ","").replaceAll("[^a-zA-Z0-9]","");
        String strReverse = new StringBuilder(s).reverse().toString();
        return strReverse.equals(s);



        //cale zdanie usune spacje i specjalne znaki
        //odwroce jedno ze zdan i porownam




    }
}
