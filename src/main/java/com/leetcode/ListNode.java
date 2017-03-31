package com.leetcode;

/**
 * Created by Richard on 17/3/14.
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

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
}
