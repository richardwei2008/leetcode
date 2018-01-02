package com.leetcode.array;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Richard on 18/1/2.
 *
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 * You may assume no duplicate exists in the array.
 *
 */
public class SearchInRotatedSortedArrayTest {

    @Test
    public void test() {
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int target = 6;
        int index = new SearchInRotatedSortedArray().search(nums, target);
        Assert.assertEquals(2, index);
    }

    @Test
    public void test_pivot() {
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int pivot = new SearchInRotatedSortedArray().findPivot(nums);
        Assert.assertEquals(3, pivot);
    }

    @Test
    public void test_rangeCheck() {
        int[] nums = new int[]{1};
        int target = 2;
        int index = new SearchInRotatedSortedArray().search(nums, target);
        Assert.assertEquals(-1, index);
    }

    @Test
    public void test_pivot_rangeCheck() {
        int[] nums = new int[]{1};
        int pivot = new SearchInRotatedSortedArray().findPivot(nums);
        Assert.assertEquals(0, pivot);
    }

    @Test
    public void test_wrongAnswer1() {
        int[] nums = new int[]{3, 1};
        int target = 3;
        int index = new SearchInRotatedSortedArray().search(nums, target);
        Assert.assertEquals(0, index);
    }

    @Test
    public void test_pivot_wrongAnswer1() {
        int[] nums = new int[]{3, 1};
        int pivot = new SearchInRotatedSortedArray().findPivot(nums);
        Assert.assertEquals(0, pivot);
    }

    @Test
    public void test_wrongAnswer2() {
        int[] nums = new int[]{1, 3};
        int target = 3;
        int index = new SearchInRotatedSortedArray().search(nums, target);
        Assert.assertEquals(1, index);
    }

    @Test
    public void test_pivot_wrongAnswer2() {
        int[] nums = new int[]{1, 3};
        int pivot = new SearchInRotatedSortedArray().findPivot(nums);
        Assert.assertEquals(1, pivot);
    }

    @Test
    public void test_wrongAnswer3() {
        int[] nums = new int[]{1, 3, 5};
        int target = 5;
        int index = new SearchInRotatedSortedArray().search(nums, target);
        Assert.assertEquals(2, index);
    }

    @Test
    public void test_pivot_wrongAnswer3() {
        int[] nums = new int[]{1, 3, 5};
        int pivot = new SearchInRotatedSortedArray().findPivot(nums);
        Assert.assertEquals(2, pivot);
    }

    @Test
    public void test_pivot_wrongAnswer4() {
        int[] nums = new int[]{1, 3, 5, 7};
        int pivot = new SearchInRotatedSortedArray().findPivot(nums);
        Assert.assertEquals(3, pivot);
    }

    @Test
    public void test_wrongAnswer5() {
        int[] nums = new int[]{4, 5, 1, 2, 3};
        int target = 1;
        int index = new SearchInRotatedSortedArray().search(nums, target);
        Assert.assertEquals(2, index);
    }

    @Test
    public void test_pivot_wrongAnswer5() {
        int[] nums = new int[]{4, 5, 1, 2, 3};
        int pivot = new SearchInRotatedSortedArray().findPivot(nums);
        Assert.assertEquals(1, pivot);
    }

    @Test
    public void test_wrongAnswer6() {
        int[] nums = new int[]{4, 5, 6, 7, 8, 1, 2, 3};
        int target = 8;
        int index = new SearchInRotatedSortedArray().search(nums, target);
        Assert.assertEquals(4, index);
    }

    @Test
    public void test_pivot_wrongAnswer6() {
        int[] nums = new int[]{4, 5, 6, 7, 8, 1, 2, 3};
        int pivot = new SearchInRotatedSortedArray().findPivot(nums);
        Assert.assertEquals(4, pivot);
    }
}
