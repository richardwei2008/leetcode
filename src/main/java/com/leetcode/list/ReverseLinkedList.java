package com.leetcode.list;

import com.leetcode.ListNode;

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
public class ReverseLinkedList {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode h = new ListNode(0);
        h.next = head;
        ListNode prev = h;
        int i = m;
        while (null != prev.next) {
            if (i > 1) {
                prev = prev.next;
                i--;
            } else {
                break;
            }
        }
        ListNode start = prev.next; // a pointer to the beginning of a sub-list that will be reversed
        ListNode then = start.next;
        i = n - m;
        // insert next to front one by one till n - m movements
        while (i > 0) {
            start.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = start.next;
            i--;
        }

        return h.next;
    }
}
