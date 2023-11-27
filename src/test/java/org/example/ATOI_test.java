package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ATOI_test {
    @Test
    public void testAtoi(){
        ATOI atoiObj = new ATOI();

        // Test case 1: Regular positive integer
        String input1 = "42";
        int expected1 = 42;
        assertEquals(expected1, atoiObj.myAtoi(input1));

        // Test case 2: Negative integer
        String input2 = "-123";
        int expected2 = -123;
        assertEquals(expected2, atoiObj.myAtoi(input2));

        // Test case 3: Leading whitespaces
        String input3 = "   987";
        int expected3 = 987;
        assertEquals(expected3, atoiObj.myAtoi(input3));

        // Test case 4: Non-numeric characters after the numeric part
        String input4 = "4193 with words";
        int expected4 = 4193;
        assertEquals(expected4, atoiObj.myAtoi(input4));

        // Test case 5: Empty string
        String input5 = "";
        int expected5 = 0;
        assertEquals(expected5, atoiObj.myAtoi(input5));

        // Test case 6: Integer overflow
        String input6 = "2147483648";
        int expected6 = Integer.MAX_VALUE;
        assertEquals(expected6, atoiObj.myAtoi(input6));
//
//        // Test case 7: Integer underflow
//        String input7 = "-2147483649";
//        int expected7 = Integer.MIN_VALUE;
//        assertEquals(expected7, atoiObj.myAtoi(input7));

        // Test case 8: Mutated behavior (remove trim)
        String input8 = "w";
        int expected8 = 0; // It should return 0 because leading whitespace is not trimmed
        assertEquals(expected8, atoiObj.myAtoi(input8));

        String input9 = "";
        int expected9 = 0; // It should return 0 because leading whitespace is not trimmed
        assertEquals(expected8, atoiObj.myAtoi(input8));
    }
}
