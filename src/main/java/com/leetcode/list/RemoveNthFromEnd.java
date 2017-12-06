package com.leetcode.list;

import com.leetcode.ListNode;

import java.util.List;

/**
 * Created by Richard on 17/12/6.
 *
 * Given a linked list, remove the nth node from
 * the end of list and return its head.
 *
 * For example,
 *
 *      Given linked list: 1->2->3->4->5, and n = 2.
 *      After removing the second node from the end,
 *      the linked list becomes 1->2->3->5
 *
 * Note:
 * Given n will always be valid.
 * Try to do this in one pass.
 *
 *
 */
public class RemoveNthFromEnd {


    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode h = new ListNode(0);
        h.next = head;
        ListNode pointer = h;
        ListNode prevHead = new ListNode(0);
        prevHead.next = pointer;
        while (null != pointer.next) {
            if (n > 0) {
                n--;
            } else {
                prevHead.next = prevHead.next.next;
            }
            pointer = pointer.next;
        }
        prevHead.next.next = prevHead.next.next.next;
        prevHead.next = null;
        return h.next;
    }
}
