package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Richard on 17/3/14.
 */

public class TwoSumDemoTest {


    @Test
    public void testTwoSum_initTwo() {
        int[] nums = new int[]{2, 7 , 11, 13};
        int[] result = TwoSumDemo.twoSum(nums, 9);
        Assert.assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void testTwoSum_lastTwo() {
        int[] nums = new int[]{2, 7 , 11, 13};
        int[] result = TwoSumDemo.twoSum(nums, 24);
        Assert.assertArrayEquals(new int[]{2, 3}, result);
    }

    @Test
    public void testTwoSum_succTwo() {
        int[] nums = new int[]{2, 7 , 11, 13};
        int[] result = TwoSumDemo.twoSum(nums, 18);
        Assert.assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void testTwoSum_discTwo() {
        int[] nums = new int[]{2, 7 , 11, 13};
        int[] result = TwoSumDemo.twoSum(nums, 13);
        Assert.assertArrayEquals(new int[]{0, 2}, result);
    }

    @Test
    public void testTwoSum_random() {
        int[] nums = new int[]{7, 13 , 11, 2};
        int[] result = TwoSumDemo.twoSum(nums, 15);
        Assert.assertArrayEquals(new int[]{1, 3}, result);
    }
}
