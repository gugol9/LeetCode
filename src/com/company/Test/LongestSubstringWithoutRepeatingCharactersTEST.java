package com.company.Test;

import com.company.Top100.Medium.LongestSubstringWithoutRepeatingCharacters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubstringWithoutRepeatingCharactersTEST {
    @Test
    public void test_01(){
        Assertions.assertEquals(3, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabbac"));
        Assertions.assertEquals(1, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("aaaaa"));
        Assertions.assertEquals(5, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcde"));
        Assertions.assertEquals(3, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew"));
        Assertions.assertEquals(3, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
    }
}
