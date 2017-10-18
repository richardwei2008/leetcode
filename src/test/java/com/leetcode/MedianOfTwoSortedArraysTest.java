package com.leetcode;


import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Richard on 17/3/31.
 *
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 *
 * Example 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * The median is 2.0
 *
 * Example 2:
 *
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * The median is (2 + 3)/2 = 2.5
 *
 */
public class MedianOfTwoSortedArraysTest {

    private MedianOfTwoSortedArrays finder = new MedianOfTwoSortedArrays();

    @Test
    public void testFindMedianSortedArrays_Example1() {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        double result = finder.findMedianSortedArrays(nums1, nums2);
        double expected = 2.0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testFindMedianSortedArrays_Example2() {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        double result = finder.findMedianSortedArrays(nums1, nums2);
        double expected = 2.5;
        Assert.assertEquals(expected, result);
    }
}
