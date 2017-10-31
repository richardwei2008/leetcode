package com.leetcode;

import java.util.Comparator;

/**
 * Created by Richard on 17/3/14.
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    public static Comparator<ListNode> ListNodeComparator
            = new Comparator<ListNode>() {

        public int compare(ListNode o1, ListNode o2) {
            //ascending order
            return o1.val - o2.val;
        }

    };

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (null == this && null == o) {
            return true;
        }
        ListNode itr1 = this;
        ListNode itr2 = (ListNode) o;
        while (null != itr1 && null != itr2) {
            if (itr1.val != itr2.val) {
                return false;
            }
            itr1 = itr1.next;
            itr2 = itr2.next;
        }

        if (null == itr1 && null == itr2) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean listEquals(ListNode expected, ListNode result) {
        if (expected == null && result == null) {
            return true;
        }
        while (expected.val == result.val
                && expected.next != null && result.next != null) {
            expected = expected.next;
            result = result.next;
        }
        if (expected.val == result.val
                && expected.next == null && result.next == null) {
            return true;
        } else {
            return false;
        }
    }
}
