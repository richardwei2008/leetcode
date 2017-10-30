package com.leetcode.merge;

import com.leetcode.ListNode;

/**
 * Created by Richard on 17/10/30.
 *
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 *
 */
public class MergeTwoSortedList {


    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode h1 = new ListNode(0);
        h1.next = l1;
        ListNode h2 = new ListNode(0);
        h2.next = l2;
        ListNode merged = new ListNode(0);
        ListNode head = merged;
        while(h1.next != null && h2.next != null) {
            if (h1.next.val < h2.next.val) {
                merged.next = h1.next;
                h1.next = h1.next.next;
                merged.next.next = null;
            } else {
                merged.next = h2.next;
                h2.next = h2.next.next;
                merged.next.next = null;
            }
            merged = merged.next;
        }
        if (h1.next != null) {
            merged.next = h1.next;
        }
        if (h2.next != null) {
            merged.next = h2.next;
        }
        return head.next;
    }

}
