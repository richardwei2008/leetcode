package com.leetcode.list;

import com.leetcode.ListNode;
import com.leetcode.list.AddTwoDemo;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Richard on 17/3/14.
 *
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 *
 */
public class AddTwoDemoTest {

    private AddTwoDemo addTwo = new AddTwoDemo();

    @Test
    public void testAddTwo_basic() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = addTwo.addTwoNumbers(l1, l2);
        ListNode expected = new ListNode(7);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(8);
        Assert.assertEquals(true, expected.equals(result));
    }

    @Test
    public void testAddTwo_inequalDigit() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = addTwo.addTwoNumbers(l1, l2);
        ListNode expected = new ListNode(7);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(5);
        Assert.assertEquals(true, expected.equals(result));
    }
}
