package com.leetcode.array;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Richard on 17/12/7.
 *
 * Given an array and a value, remove all instances of that value
 * in-place and return the new length.
 *
 * DO not allocate extra space for another array,
 * you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * The order of elements can be changed.
 * It doesn't matter what you leave beyond the new length.
 *
 * Example:
 *
 *  Given nums = [3, 2, 2, 3], val = 3,
 *  Your function should return length = 2,
 *  with the first two elements of nums being 2.
 *
 */
public class RemoveElementTest {

    @Test
    public void testRemoveElement() {
        int[] nums = new int[]{3, 2, 2, 3};
        int val = 3;

        int actual = new RemoveElement().removeElement(nums, val);
        Assert.assertEquals(2, actual);
        org.junit.Assert.assertArrayEquals(new int[]{2, 2}, Arrays.copyOf(nums, actual));
    }

    @Test
    public void testRemoveElement_wrongAnswer() {
        int[] nums = new int[]{3, 3};
        int val = 3;

        int actual = new RemoveElement().removeElement(nums, val);
        Assert.assertEquals(0, actual);
        org.junit.Assert.assertArrayEquals(new int[]{}, Arrays.copyOf(nums, actual));
    }
}
