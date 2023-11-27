package org.example;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class AddTwoNumbersTest {

    // Helper method to create a linked list from an array of integers
    private ListNode createLinkedList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next;
    }

    // Helper method to convert a linked list to an array of integers
    private int[] convertToArray(ListNode head) {
        int size = 0;
        ListNode current = head;

        while (current != null) {
            size++;
            current = current.next;
        }

        int[] result = new int[size];
        current = head;
        int index = 0;

        while (current != null) {
            result[index++] = current.val;
            current = current.next;
        }

        return result;
    }

    @Test
    public void testAddTwoNumbers() {
        addtwonumbers addTwoNumbersObj = new addtwonumbers();

        // Test case 1: Regular scenario
        ListNode l1 = createLinkedList(new int[]{2, 4, 3});
        ListNode l2 = createLinkedList(new int[]{5, 6, 4});
        int[] expected1 = {8, 0, 7};
        assertArrayEquals(expected1, convertToArray(addTwoNumbersObj.addTwoNumbers(l1, l2)));

        // Test case 2: One list is longer than the other
        ListNode l3 = createLinkedList(new int[]{9, 9, 9});
        ListNode l4 = createLinkedList(new int[]{9, 9});
        int[] expected2 = {1, 0, 9, 8};
        assertArrayEquals(expected2, convertToArray(addTwoNumbersObj.addTwoNumbers(l3, l4)));

        // Test case 3: One list is empty
        ListNode l5 = createLinkedList(new int[]{});
        ListNode l6 = createLinkedList(new int[]{5, 6, 4});
        int[] expected3 = {5, 6, 4};
        assertArrayEquals(expected3, convertToArray(addTwoNumbersObj.addTwoNumbers(l5, l6)));

        // Test case 4: Both lists are empty
        ListNode l7 = createLinkedList(new int[]{});
        ListNode l8 = createLinkedList(new int[]{});
        int[] expected4 = {};
        assertArrayEquals(expected4, convertToArray(addTwoNumbersObj.addTwoNumbers(l7, l8)));

        // Test case 5: Mutated behavior (reverseList)
        ListNode l9 = createLinkedList(new int[]{2, 4, 3});
        ListNode l10 = createLinkedList(new int[]{5, 6, 4});
        int[] expected5 = {8, 0, 7}; // It should return the incorrect result
        assertArrayEquals(expected5, convertToArray(addTwoNumbersObj.addTwoNumbers2(l9, l10)));

        // Test case 6: Mutated behavior (addTwoNumbers0)
        ListNode l11 = createLinkedList(new int[]{2, 4, 3});
        ListNode l12 = createLinkedList(new int[]{5, 6, 4});
        int[] expected6 = {8, 0, 7}; // It should return the incorrect result
        assertArrayEquals(expected6, convertToArray(addTwoNumbersObj.addTwoNumbers2(l11, l12)));
    }
}
