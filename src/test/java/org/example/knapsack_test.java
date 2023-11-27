package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.*;
public class knapsack_test {
    @Test
    public void testknap()
    {
        knapsack ks = new knapsack();

        ArrayList<Integer> values = new ArrayList<>(List.of(30, 30, 30));
        ArrayList<Integer> weights = new ArrayList<>(List.of(10, 10, 10));
        int n = values.size();
        int w = 20;
        int expectedOutput = 60;
        int result = knapsack.maxProfit(values, weights, n, w);
        assertEquals(expectedOutput, result);

        ArrayList<Integer> values2 = new ArrayList<>(List.of(60, 100, 120));
        ArrayList<Integer> weights2 = new ArrayList<>(List.of(10, 20, 30));
        int n2 = values.size();
        int w2 = 0;
        int expectedOutput2 = 0;
        int result2 = knapsack.maxProfit(values2, weights2, n2, w2);
        assertEquals(expectedOutput2, result2);



    }

}
