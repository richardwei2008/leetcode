package com.leetcode.integer;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Richard on 17/10/30.
 */
public class FirstMissingPositiveTest {

    @Test
    public void testFirstMissingPositive_1_2_0() {
        int[] nums = new int[]{1, 2, 0};

        int result = new FirstMissingPositive().firstMissingPositive(nums);

        Assert.assertEquals(3, result);
    }

    @Test
    public void testFirstMissingPositive_3_4_ne1_1() {
        int[] nums = new int[]{3, 4, -1, 1};

        int result = new FirstMissingPositive().firstMissingPositive(nums);

        Assert.assertEquals(2, result);
    }
}
