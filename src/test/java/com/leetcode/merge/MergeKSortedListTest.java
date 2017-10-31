package com.leetcode.merge;

import com.leetcode.ListNode;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Richard on 17/10/31.
 */
public class MergeKSortedListTest {

    @Test
    public void testBruteForce() {
        ListNode[] lists = getSampleListNodes();

        ListNode result = new MergeKSortedList().bruteForce(lists);

        Assert.assertEquals(true, ListNode.listEquals(expected(), result));
    }

    @Test
    public void testKCompare() {
        ListNode[] lists = getSampleListNodes();

        ListNode result = new MergeKSortedList().mergeWithKCompare(lists);

        Assert.assertEquals(true, ListNode.listEquals(expected(), result));
    }

    @Test
    public void testPriorityQueue() {
        ListNode[] lists = getSampleListNodes();

        ListNode result = new MergeKSortedList().mergeWithPriorityQueue(lists);

        Assert.assertEquals(true, ListNode.listEquals(expected(), result));
    }

    @Test
    public void testDivideAndConquer() {
        ListNode[] lists = getSampleListNodes();

        ListNode result = new MergeKSortedList().mergeWithDivideAndConquer(lists);

        Assert.assertEquals(true, ListNode.listEquals(expected(), result));
    }

    @Test
    public void testDivideAndConquer_timeLimitExceeded() {
        ListNode[] lists = new ListNode[4];

        lists[0] = null;

        lists[1] = new ListNode(-1);
        lists[1].next = new ListNode(5);
        lists[1].next.next = new ListNode(11);

        lists[2] = null;

        lists[3] = new ListNode(6);
        lists[3].next = new ListNode(10);

        ListNode result = new MergeKSortedList().mergeWithDivideAndConquer(lists);

        ListNode expected = new ListNode(-1);
        ListNode pointer = expected;

        pointer.next = new ListNode(5);
        pointer = pointer.next;

        pointer.next = new ListNode(6);
        pointer = pointer.next;

        pointer.next = new ListNode(10);
        pointer = pointer.next;

        pointer.next = new ListNode(11);
        pointer = pointer.next;

        Assert.assertEquals(true, ListNode.listEquals(expected, result));
    }

    private ListNode[] getSampleListNodes() {
        ListNode[] lists = new ListNode[3];

        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(3);
        lists[0].next.next = new ListNode(4);

        lists[1] = new ListNode(0);
        lists[1].next = new ListNode(2);
        lists[1].next.next = new ListNode(4);

        lists[2] = new ListNode(6);
        lists[2].next = new ListNode(9);
        return lists;
    }

    private ListNode expected() {
        ListNode head = new ListNode(0);
        ListNode pointer = head;

        pointer.next = new ListNode(0);
        pointer = pointer.next;

        pointer.next = new ListNode(1);
        pointer = pointer.next;

        pointer.next = new ListNode(2);
        pointer = pointer.next;

        pointer.next = new ListNode(3);
        pointer = pointer.next;

        pointer.next = new ListNode(4);
        pointer = pointer.next;

        pointer.next = new ListNode(4);
        pointer = pointer.next;

        pointer.next = new ListNode(6);
        pointer = pointer.next;

        pointer.next = new ListNode(9);

        return head.next;
    }
}
