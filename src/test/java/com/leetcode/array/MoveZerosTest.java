package com.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Richard on 17/12/7.
 *
 * Given an array nums, with a function to move all 0's
 * to the end of it while maintaining the relative order
 * of the non-zero elements.
 *
 * For example, given nums = [0, 1, 0, 3, 12], after
 * calling your function, nums should be [1, 3, 12, 0, 0]
 *
 * Note:
 *
 *  1. You must do this in-place without making a copy of the array
 *  2. Minimize the total number of operations
 *
 */
public class MoveZerosTest {

    @Test
    public void testMoveZeros() {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        new MoveZeros().moveZeros(nums);
        Assert.assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }


    @Test
    public void testMoveZeros_wrongAnswer1() {
        int[] nums = new int[]{0, 1, 0};
        new MoveZeros().moveZeros(nums);
        Assert.assertArrayEquals(new int[]{1, 0, 0}, nums);
    }
}
