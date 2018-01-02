package com.leetcode.array;

import java.util.Arrays;

/**
 * Created by Richard on 18/1/2.
 *
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 * You may assume no duplicate exists in the array.
 *
 */
public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        if (null == nums || nums.length == 0) {
            return -1;
        }
        int pivot = findPivot(nums);
        if (target >= nums[0] && pivot >= 0) {
            int index = Arrays.binarySearch(nums, 0, pivot + 1, target);
            if (index < 0) {
                return -1;
            }
            return index;
        } else {
            int index = Arrays.binarySearch(nums, pivot + 1, nums.length, target);
            if (index < 0) {
                return -1;
            }
            return index;
        }
    }

    protected int findPivot(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int pivot = 0;
        while (i < j) {
            if (nums[i] < nums[i+1]) {
                i++;
            } else {
                pivot = i;
                return pivot;
            }
            if (nums[j-1] < nums[j]) {
                j--;
            } else {
                pivot = j - 1;
                return pivot;
            }
        }
        pivot = nums.length - 1;
        return pivot;
    }
}
