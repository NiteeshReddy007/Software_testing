package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class longPalindrome_test {
    @Test
    public void testPalin(){
        longPalindrome longPalindromeObj = new longPalindrome();

        // Test case 1: Regular palindrome
        String input1 = "babad";
        String expected1 = "aba";
        assertEquals(expected1, longPalindromeObj.longestPalindrome(input1));

        // Test case 2: Single character
        String input2 = "c";
        String expected2 = "c";
        assertEquals(expected2, longPalindromeObj.longestPalindrome(input2));

        // Test case 3: Empty string
        String input3 = "";
        String expected3 = "";
        assertEquals(expected3, longPalindromeObj.longestPalindrome(input3));


    }
}
