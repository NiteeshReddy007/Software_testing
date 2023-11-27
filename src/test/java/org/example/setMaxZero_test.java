package org.example;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import java.util.*;

public class setMaxZero_test {
    @Test
    public void testmat(){
        setMatZero setZero= new setMatZero();

        // Test case 1: Regular matrix with zeros
        int[][] matrix1 = {{1, 2, 3}, {4, 0, 6}, {7, 8, 9}};
        setZero.setZeroes(matrix1);
        int[][] expected1 = {{1, 0, 3}, {0, 0, 0}, {7, 0, 9}};
        assertArrayEquals(expected1, matrix1);

        // Test case 2: Matrix without zeros
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        setZero.setZeroes(matrix2);
        int[][] expected2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertArrayEquals(expected2, matrix2);

        // Test case 3: Matrix with all zeros
        int[][] matrix3 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        setZero.setZeroes(matrix3);
        int[][] expected3 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        assertArrayEquals(expected3, matrix3);

        // Test case 4: Matrix with a single row of zeros
        int[][] matrix4 = {{1, 2, 3, 4}};
        setZero.setZeroes(matrix4);
        int[][] expected4 = {{1, 2, 3, 4}};
        assertArrayEquals(expected4, matrix4);
    }
}
