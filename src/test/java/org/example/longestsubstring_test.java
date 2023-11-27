package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class longestsubstring_test {

    @Test
    public void testLsubstring()
    {
        longestsubstring ls = new longestsubstring();

        String input1 = "abcabcbb";
        int expectedOutput1 = 3;
        int result1 = longestsubstring.lengthOfLongestSubstring(input1);
        assertEquals(expectedOutput1, result1);

        String input2 = "aaaaa";
        int expectedOutput2 = 1;
        int result2 = longestsubstring.lengthOfLongestSubstring(input2);
        assertEquals(expectedOutput2, result2);

        String input3 = " ";
        int expectedOutput3 = 0;
        int result3 = longestsubstring.lengthOfLongestSubstring(input3);
        assertEquals(expectedOutput2, result3);
    }
}
