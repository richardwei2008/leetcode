package com.leetcode.sum;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Richard on 17/12/5.
 *
 * Given an array S of n integers, are there elements a, b, c, and d in S
 * such that a + b + c + d = target?
 * Find all unique quadruplets in the array which gives the sum of target.
 *
 * Note: The solution set must not contain duplicate quadruplets.
 *
 * For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.
 *
 * A solution set is:
 * [
 *   [-1,  0, 0, 1],
 *   [-2, -1, 1, 2],
 *   [-2,  0, 0, 2]
 * ]
 *
 *
 *
 */
public class FourSumTest {

    @Test
    public void testBaseCase() {
        int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        int target = 0;

        List<List<Integer>> list = new FourSum().fourSum(nums, target);

        // assert [-2, -1, 1, 2] at list[0]
        int[] expected1 = new int[]{-2, -1, 1, 2};
        Assert.assertArrayEquals(expected1, toIntArray(list.get(0)));

        // assert [-2, 0, 0, 2] at list[1]
        int[] expected2 = new int[]{-2, 0, 0, 2};
        Assert.assertArrayEquals(expected2, toIntArray(list.get(1)));

        // assert [-1, 0, 0, 1] at list[2]
        int[] expected3 = new int[]{-1, 0, 0, 1};
        Assert.assertArrayEquals(expected3, toIntArray(list.get(2)));
    }

    private static int[] toIntArray(List<Integer> integerList) {
        int[] intArray = new int[integerList.size()];
        for (int i = 0; i < integerList.size(); i++) {
            intArray[i] = integerList.get(i);
        }
        return intArray;
    }
}
