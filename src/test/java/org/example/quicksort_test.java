package org.example;
import static org.junit.Assert.*;
import org.junit.Test;
public class quicksort_test {
    @Test
    public void testquick(){
        quicksort qs = new quicksort();

        int[] array = {12, 11, 13, 5, 6, 7};
        quicksort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(new int[]{5, 6, 7, 11, 12, 13}, array);

    }

}
