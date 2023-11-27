package org.example;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
public class mergesort_test {
    @Test
    public void testmergesort()
    {
        mergesort ms = new mergesort();

        int[] input1 = {4, 2, 7, 1, 9, 3, 5};
        int[] expectedOutput1 = {1, 2, 3, 4, 5, 7, 9};
        mergesort.mergeSort(input1, 0, input1.length);
        assertArrayEquals(expectedOutput1, input1);

        int[] input2 = {2, 4, 1, 3, 5};
        int[] expectedOutput2 = {1, 2, 3, 4, 5};
        mergesort.mergeSort(input2, 0, input2.length);
        assertArrayEquals(expectedOutput2, input2);

//        int[] input3 = {4, 2, 7, 1, 9, 3, 5};
//        int[] expectedOutput3 = {1, 2, 3, 4, 5, 7, 9};
//        mergesort.mergeSort(input2, 0, input3.length);
//        assertArrayEquals(expectedOutput3, input3);
    }
}
