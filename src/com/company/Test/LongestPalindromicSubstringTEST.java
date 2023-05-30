package com.company.Test;

import com.company.Top100.Medium.LongestPalindromicSubstring;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LongestPalindromicSubstringTEST {
@Test
    public void test01(){
        Assertions.assertEquals("bb", LongestPalindromicSubstring.longestPalindrome("bb"));
        Assertions.assertEquals("b", LongestPalindromicSubstring.longestPalindrome("b"));
        Assertions.assertEquals("bab", LongestPalindromicSubstring.longestPalindrome("babad"));
        Assertions.assertEquals("", LongestPalindromicSubstring.longestPalindrome(""));
    }
}
