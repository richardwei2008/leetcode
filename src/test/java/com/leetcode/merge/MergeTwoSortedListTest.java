package com.leetcode.merge;

import com.leetcode.ListNode;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Richard on 17/10/30.
 */
public class MergeTwoSortedListTest {

    @Test
    public void testMergeTwoSortedList() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(6);

        ListNode result = new MergeTwoSortedList().mergeTwoLists(l1, l2);
        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(5);
        expected.next.next.next.next = new ListNode(6);

        Assert.assertEquals(true, listNodeEquals(expected, result));
    }

    protected boolean listNodeEquals(ListNode expected, ListNode result) {
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
