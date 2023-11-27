package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class lonfcmnprefix_test {
    @Test
    public void testprefix(){
        LongCmnPrefix prefixObj = new LongCmnPrefix();

        // Test case 1: Regular common prefix
        String[] input1 = {"flower", "flow", "flight"};
        String expected1 = "fl";
        assertEquals(expected1, prefixObj.longestCommonPrefix(input1));

        // Test case 2: Empty array
        String[] input2 = {};
        String expected2 = "";
        assertEquals(expected2, prefixObj.longestCommonPrefix(input2));

        // Test case 3: Single word
        String[] input3 = {"hello"};
        String expected3 = "hello";
        assertEquals(expected3, prefixObj.longestCommonPrefix(input3));
    }
}
