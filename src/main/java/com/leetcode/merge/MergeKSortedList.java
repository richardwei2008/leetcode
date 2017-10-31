package com.leetcode.merge;

import com.leetcode.ListNode;

import java.util.*;

import static javafx.scene.input.KeyCode.T;

/**
 * Created by Richard on 17/10/31.
 *
 * Merge k sorted linked lists and
 * return it as one sorted list.
 *
 * Analyze and describe its complexity.
 *
 */
public class MergeKSortedList {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public ListNode mergeKLists(ListNode[] lists) {
        return null;
    }

    protected ListNode bruteForce(ListNode[] lists) {
        if (null == lists) {
            return null;
        }

        ArrayList<ListNode> nodes = new ArrayList<ListNode>();
        for (ListNode l : lists) {
            while (null != l) {
                nodes.add(l);
                ListNode temp = l;
                l = l.next;
                temp.next = null;
            }
        }

        /**
         * sort
         */
        Collections.sort(nodes, ListNode.ListNodeComparator);

        /**
         * traverse
         */
        ListNode head = new ListNode(0);
        ListNode pointer = head;
        for (ListNode n: nodes) {
            pointer.next = n;
            pointer = pointer.next;
        }

        return head.next;
    }

    /**
     * Time Limit Exceeded
     *
     * @param lists
     * @return
     */
    protected ListNode mergeWithKCompare(ListNode[] lists) {
        if (null == lists) {
            return null;
        }

        ListNode head = new ListNode(0);
        ListNode pointer = head;

        int next = next(lists);
        while(next >= 0) {
            int kth = next;
            int min = lists[next].val;
            for (int i = 0; i < lists.length; i++) {
                if (null != lists[i] && lists[i].val < min) {
                    min = lists[i].val;
                    kth = i;
                }
            }
            pointer.next = lists[kth];
            ListNode remove = lists[kth];
            lists[kth] = lists[kth].next;
            remove.next = null;
            pointer = pointer.next;

            next = next(lists);
        }
        return head.next;
    }

    private int next(ListNode[] lists) {
        for (int i = 0; i < lists.length; i++) {
            if (null != lists[i]) {
                return i;
            }
        }
        return -1;
    }

    protected ListNode mergeWithPriorityQueue(ListNode[] lists) {
        if (null == lists) {
            return null;
        }

        ListNode head = new ListNode(0);
        ListNode pointer = head;

        PriorityQueue<ListNode> q = new PriorityQueue<ListNode>(
                16, ListNode.ListNodeComparator);

        for (ListNode l: lists) {
            if (null != l) {
                q.add(l);
            }
        }

        while (!q.isEmpty()) {
            ListNode node = q.poll();
            pointer.next = node;
            pointer = pointer.next;
            node = node.next;
            pointer.next = null;
            if (null != node) {
                q.add(node);
            }
        }

        return head.next;
    }

    protected ListNode mergeWithDivideAndConquer(ListNode[] lists) {
        if (null == lists || lists.length == 0) {
            return null;
        }
        int k = lists.length;
        int interval = 1;

        while (interval < k) {
            for (int i = 0; i < k - interval; i += interval * 2) {
                lists[i] = this.mergeTwoLists(lists[i], lists[i + interval]);
            }
            interval *= 2;
        }

        return lists[0];

    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode head = new ListNode(0);
        ListNode pointer = head;
        while(l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                pointer.next = l1;
                ListNode remove = l1;
                l1 = l1.next;
                remove.next = null;
            } else {
                pointer.next = l2;
                ListNode remove = l2;
                l2 = l2.next;
                remove.next = null;
            }
            pointer = pointer.next;
        }
        if (l1 != null) {
            pointer.next = l1;
        }
        if (l2 != null) {
            pointer.next = l2;
        }
        return head.next;
    }
}
