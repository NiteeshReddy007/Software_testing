package org.example;
import static org.junit.Assert.*;
import org.junit.Test;
public class test_binary {
    @Test
    public void testbinary(){
        binarisearch bs = new binarisearch();

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 6;
        int result = binarisearch.search(nums, target);
        assertEquals(5, result);

        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target2 = 10;
        int result2 = binarisearch.search(nums2, target2);
        assertEquals(-1, result2);


    }
}
