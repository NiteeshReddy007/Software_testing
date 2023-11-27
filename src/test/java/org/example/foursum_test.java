package org.example;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class foursum_test {

    @Test
    public void testFourSum() {
        Foursum fourSum = new Foursum();

        // Test valid fourSum
        int[] nums1 = {1, 0, -1, 0, -2, 2};
        int target1 = 0;
        List<List<Integer>> result1 = fourSum.fourSum(nums1, target1);
        assertEquals(3, result1.size());

        // Test empty array
        int[] nums2 = {};
        int target2 = 0;
        List<List<Integer>> result2 = fourSum.fourSum(nums2, target2);
        assertEquals(0, result2.size());

        // Test array with less than four elements
        int[] nums3 = {1, 2, 3};
        int target3 = 6;
        List<List<Integer>> result3 = fourSum.fourSum(nums3, target3);
        assertEquals(0, result3.size());

        // Test array with duplicate elements
        int[] nums4 = {1, 2, 2, 3, 4, 4, 5};
        int target4 = 10;
        List<List<Integer>> result4 = fourSum.fourSum(nums4, target4);
        assertEquals(2, result4.size());

        // Test negative target value
        int[] nums5 = {1, 2, 3, 4};
        int target5 = -1;
        List<List<Integer>> result5 = fourSum.fourSum(nums5, target5);
        assertEquals(0, result5.size());

        // Test negative numbers in the array
        int[] nums6 = {-1, -2, -3, -4};
        int target6 = -10;
        List<List<Integer>> result6 = fourSum.fourSum(nums6, target6);
        assertEquals(1, result6.size());

        // Test mutations
        int[] nums7 = {1, 2, 2, 3, 4, 4, 5};
        int target7 = 10;
        List<List<Integer>> result7 = fourSum.fourSum(nums7, target7);
        assertEquals(2, result7.size()); // Original
        assertEquals(0, fourSum.fourSum(null, target7).size()); // Mutation: null array
        assertEquals(0, fourSum.fourSum(nums7, 0).size()); // Mutation: zero target
    }
}
