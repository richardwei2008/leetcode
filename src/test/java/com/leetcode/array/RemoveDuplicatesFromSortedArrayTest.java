package com.leetcode.array;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Richard on 17/12/7.
 *
 * Given a sorted array, remove the duplicates in-place such that
 * each element appear only once and return the new length.
 *
 * Do not allocate extra space for another array, you must do
 * this by modifying the input array in-place with O(1) extra memory
 *
 * Example:
 *
 *  Given nums = [1, 1, 2]
 *
 *  Your function should return length = 2,
 *  with the first two elements of nums being 1 and 2 respectively.
 *  It doesn't matter what you leave beyond the new length
 */
public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void testRemoveDuplicates() {
        int[] nums = new int[]{1, 1, 2};

        int actual = new RemoveDuplicatesFromSortedArray().removeDuplicates(nums);

        Assert.assertEquals(2, actual);
    }

    @Test
    public void testRemoveDuplicates_wrongAnswer1() {
        int[] nums = new int[]{1, 1, 2, 3};

        int actual = new RemoveDuplicatesFromSortedArray().removeDuplicates(nums);

        Assert.assertEquals(3, actual);
        int[] expectedNums = new int[]{1, 2, 3};
        org.junit.Assert.assertArrayEquals(expectedNums, Arrays.copyOf(nums, actual));
    }

    @Test
    public void testRemoveDuplicates_wrongAnswer2() {
        int[] nums = new int[]{1, 1, 1};

        int actual = new RemoveDuplicatesFromSortedArray().removeDuplicates(nums);

        Assert.assertEquals(1, actual);
        int[] expectedNums = new int[]{1};
        org.junit.Assert.assertArrayEquals(expectedNums, Arrays.copyOf(nums, actual));
    }
}
