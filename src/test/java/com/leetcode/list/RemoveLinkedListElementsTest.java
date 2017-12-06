package com.leetcode.list;

import com.leetcode.ListNode;
import org.junit.Test;

/**
 * Created by Richard on 17/12/6.
 *
 * Remove all elements from a linked list of integers that have value val.
 *
 * Example
 *
 * Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 * Return: 1 --> 2 --> 3 --> 4 --> 5
 *
 */
public class RemoveLinkedListElementsTest {

    @Test
    public void testRemoveLinkedListElements() {
        ListNode head = new ListNode(1);
        ListNode list = head;
        list.next = new ListNode(2);
        list = list.next;
        list.next = new ListNode(6);
        list = list.next;
        list.next = new ListNode(3);
        list = list.next;
        list.next = new ListNode(4);
        list = list.next;
        list.next = new ListNode(5);
        list = list.next;
        list.next = new ListNode(6);

        ListNode removedList = new RemoveLinkedListElements().removeElements(head, 5);

        ListNode expected = new ListNode(1);
        ListNode list1 = head;
        list1.next = new ListNode(2);
        list1 = list1.next;
        list1.next = new ListNode(3);
        list1 = list1.next;
        list1.next = new ListNode(4);
        list1 = list1.next;
        list1.next = new ListNode(5);
        ListNode.listEquals(expected, removedList);
    }
}
