package com.leetcode.list;

import com.leetcode.ListNode;

/**
 * Created by Richard on 17/12/6.
 *
 * Swap a linked list from position m to n. Do it in-place and in one-pass.
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
public class SwapLinkedListElements {

    public ListNode swapBetween(ListNode head, int m, int n) {
        ListNode h = new ListNode(0);
        h.next = head;
        ListNode pointer = h;
        ListNode prev_m = h;
        ListNode prev_n = h;
        while (null != pointer.next) {
            if (m > 1 || n > 1) {
                if (m > 1) {
                    prev_m = prev_m.next;
                    m--;
                }
                if (n > 1) {
                    prev_n = prev_n.next;
                    n--;
                }
                pointer = pointer.next;
            } else {
                break;
            }
        }
        if (prev_m != prev_n) {
            // insert n before m
            ListNode m_next = prev_m.next.next;
            ListNode n_next = prev_n.next.next;
            prev_n.next.next = prev_m.next;
            prev_m.next = prev_n.next;
            prev_n.next = n_next;
            // insert m after current prev_n, skip if adjacent
            if (prev_m.next.next != prev_n) {
                prev_m.next.next.next = prev_n.next;
                prev_n.next = prev_m.next.next;
                prev_m.next.next = m_next;
            }
        }

        return h.next;
    }
}
