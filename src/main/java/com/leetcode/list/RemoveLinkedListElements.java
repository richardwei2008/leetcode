package com.leetcode.list;

import com.leetcode.ListNode;

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
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode h = new ListNode(0);
        h.next = head;
        ListNode pointer = h;
        while (null != pointer.next) {
            if (pointer.next.val == val) {
                pointer.next = pointer.next.next;
            } else {
                pointer = pointer.next;
            }
        }
        return h.next;
    }
}
