package com.leetcode.list;

import com.leetcode.ListNode;
import org.junit.Test;

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
public class RemoveNthFromEndTest {

    @Test
    public void testRemoveNthFromEnd() {

        ListNode head = new ListNode(1);
        ListNode list = head;
        list.next = new ListNode(2);
        list = list.next;
        list.next = new ListNode(3);
        list = list.next;
        list.next = new ListNode(4);
        list = list.next;
        list.next = new ListNode(5);

        ListNode removedList = new RemoveNthFromEnd().removeNthFromEnd(head, 2);


        ListNode expected = new ListNode(1);
        ListNode list1 = head;
        list1.next = new ListNode(2);
        list1 = list1.next;
        list1.next = new ListNode(3);
        list1 = list1.next;
        list1.next = new ListNode(5);
        ListNode.listEquals(expected, removedList);
    }

    @Test
    public void testRemoveNthFromEnd_first() {

        ListNode head = new ListNode(1);
        ListNode list = head;
        list.next = new ListNode(2);
        list = list.next;
        list.next = new ListNode(3);
        list = list.next;
        list.next = new ListNode(4);
        list = list.next;
        list.next = new ListNode(5);

        ListNode removedList = new RemoveNthFromEnd().removeNthFromEnd(head, 5);


        ListNode expected = new ListNode(2);
        ListNode list1 = head;
        list1.next = new ListNode(3);
        list1 = list1.next;
        list1.next = new ListNode(4);
        list1 = list1.next;
        list1.next = new ListNode(5);
        ListNode.listEquals(expected, removedList);
    }

    @Test
    public void testRemoveNthFromEnd_one() {

        ListNode head = new ListNode(1);

        ListNode removedList = new RemoveNthFromEnd().removeNthFromEnd(head, 1);


        ListNode expected = null;
        ListNode.listEquals(expected, removedList);
    }

    @Test
    public void testRemoveNthFromEnd_two() {

        ListNode head = new ListNode(1);
        ListNode list = head;
        list.next = new ListNode(2);

        ListNode removedList = new RemoveNthFromEnd().removeNthFromEnd(head, 2);


        ListNode expected = new ListNode(1);
        ListNode.listEquals(expected, removedList);
    }
}
