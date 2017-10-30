package com.leetcode.integer;

/**
 * Created by Richard on 17/10/30.
 *
 * Given an unsorted integer array, find the first missing positive integer.
 *
 * For example,
 * Given [1,2,0] return 3,
 * and [3,4,-1,1] return 2.
 *
 * Your algorithm should run in O(n) time and uses constant space.
 *
 */
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        if (null == nums) {
            return -1;
        }

        int i = 0;
        while (i < nums.length) {
            if (nums[i] == i+1 || nums[i] <= 0 || nums[i] > nums.length) {
                i++;
            } else if (nums[nums[i] - 1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }

        i = 0;
        while (i < nums.length && nums[i] == i+1) i++;
        return i+1;
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
