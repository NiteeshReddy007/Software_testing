package org.example;
import java.util.*;

public class addtwonumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while (l1 != null && l2 != null) {
            s1.push(l1.val);
            l1 = l1.next;
            s2.push(l2.val);
            l2 = l2.next;
        }
        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        int carry = 0;
        while (!s1.isEmpty() && !s2.isEmpty()) {
            int sum = s1.pop() + s2.pop() + carry;
            ListNode curr = new ListNode(sum % 10);
            curr.next = p.next;
            p.next = curr;
            carry = sum / 10;
        }
        while (!s1.isEmpty()) {
            int sum = s1.pop() + carry;
            ListNode curr = new ListNode(sum % 10);
            curr.next = p.next;
            p.next = curr;
            carry = sum / 10;
        }
        while (!s2.isEmpty()) {
            int sum = s2.pop() + carry;
            ListNode curr = new ListNode(sum % 10);
            curr.next = p.next;
            p.next = curr;
            carry = sum / 10;
        }
        if (carry != 0) {
            ListNode curr = new ListNode(carry);
            curr.next = p.next;
            p.next = curr;
        }

        return dummy.next;
    }


    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode ll1 = reverseList(l1);
        ListNode ll2 = reverseList(l2);

        return reverseList(addTwoNumbers0(ll1, ll2));
    }

    public ListNode addTwoNumbers0(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int a = l1 == null ? 0 : l1.val;
            int b = l2 == null ? 0 : l2.val;
            int sum = a + b + carry;
            ListNode n = new ListNode(sum%10);
            p.next = n;
            p = p.next;
            carry = sum/10;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }

        if (carry != 0) p.next = new ListNode(carry);

        return dummy.next;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0);
        ListNode tail = null;

        while (head != null) {
            ListNode t = head;
            head = head.next;
            tail = dummy.next;
            dummy.next = t;
            dummy.next.next = tail;
        }

        return dummy.next;
    }
}
