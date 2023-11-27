
package org.example;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class threesum_test {
    @Test
    public void test_three(){
        threesum threeSumObj = new threesum();
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        assertEquals(threeSumObj.threeSum(nums1), List.of(List.of(-1, -1, 2), List.of(-1, 0, 1)));

        // Test case 2: No solution
        int[] nums2 = {1, 2, 3, 4, 5};
        assertEquals(threeSumObj.threeSum(nums2), List.of());

        // Test case 3: Empty array
        int[] nums3 = {};
        assertEquals(threeSumObj.threeSum(nums3), List.of());

    }
}
