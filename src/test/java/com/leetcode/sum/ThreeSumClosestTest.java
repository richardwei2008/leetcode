package com.leetcode.sum;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Richard on 17/12/4.
 *
 * Given an array S of n integers,
 * find three integers in S such that
 * the sum is closest to a given number, target.
 * Return the sum of the three integers.
 * You may assume that each input would have exactly one solution.
 *
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 *
 */
public class ThreeSumClosestTest {

    @Test
    public void testBaseCase() {
        int[] nums = new int[]{-1, 2, 1, -4};
        int target = 1;
        int closest = new ThreeSumClosest().threeSumClosest(nums, target);
        Assert.assertEquals(2, closest);
    }
}
