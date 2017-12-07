package com.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Richard on 17/12/7.
 *
 * Given an array of integers, 1 <= a[i] <= n (n = size of array),
 * some elements appear twice and others appear once.
 *
 * Could you do it without extra space and in O(n) runtime?
 *
 * Example:
 *
 *  Input:
 *  [4, 3, 2, 7, 8, 2, 3, 1]
 *
 *  Output:
 *  [2, 3]
 */
public class FindDuplicates2Test {

    @Test
    public void testFindDuplicates() {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> actual = new FindDuplicates().findDuplicates2(nums);

        Assert.assertArrayEquals(new int[]{3, 2}, actual.stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    public void testFindDuplicates_four() {
        int[] nums = new int[]{4, 4, 4, 4, 4};

        List<Integer> actual = new FindDuplicates().findDuplicates2(nums);

        Assert.assertArrayEquals(new int[]{4}, actual.stream().mapToInt(Integer::intValue).toArray());
    }
}
