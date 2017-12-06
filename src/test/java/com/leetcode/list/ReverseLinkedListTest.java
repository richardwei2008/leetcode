package com.leetcode.list;

import com.leetcode.ListNode;
import org.junit.Test;

/**
 * Created by Richard on 17/12/6.
 *
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.
 *
 * For example:
 *
 * Given 1 --> 2 --> 3 --> 4 --> 5 --> NULL, m = 2 and n = 4,
 * return 1 --> 4 --> 3 --> 2 --> 5 --> NULL.
 *
 * Note:
 * Given m, n satisfy the following condition:
 * 1 <= m <= n <= length of list
 *
 */
public class ReverseLinkedListTest {

    @Test
    public void testReverseBetween() {
        ListNode head = new ListNode(1);
        ListNode list = head;
        list.next = new ListNode(2);
        list = list.next;
        list.next = new ListNode(3);
        list = list.next;
        list.next = new ListNode(4);
        list = list.next;
        list.next = new ListNode(5);

        int m = 2;
        int n = 4;
        ListNode actual = new ReverseLinkedList().reverseBetween(head, m, n);

        ListNode expected = new ListNode(1);
        ListNode list1 = head;
        list1.next = new ListNode(4);
        list1 = list1.next;
        list1.next = new ListNode(3);
        list1 = list1.next;
        list1.next = new ListNode(2);
        list1 = list1.next;
        list1.next = new ListNode(5);
        ListNode.listEquals(expected, actual);

    }

    @Test
    public void testReverseBetween_memoryLimitExceed() {
        ListNode head = new ListNode(3);
        ListNode list = head;
        list.next = new ListNode(5);

        int m = 1;
        int n = 2;
        ListNode actual = new ReverseLinkedList().reverseBetween(head, m, n);

        ListNode expected = new ListNode(5);
        ListNode list1 = head;
        list1.next = new ListNode(3);

        ListNode.listEquals(expected, actual);

    }

    @Test
    public void testReverseBetween_one() {
        ListNode head = new ListNode(5);
        ListNode list = head;

        int m = 1;
        int n = 1;
        ListNode actual = new ReverseLinkedList().reverseBetween(head, m, n);

        ListNode expected = new ListNode(5);

        ListNode.listEquals(expected, actual);

    }
}
