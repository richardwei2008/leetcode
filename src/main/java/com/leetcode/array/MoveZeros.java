package com.leetcode.array;

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
public class MoveZeros {
    public void moveZeros(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - count;) {
            if (0 == nums[i]) {
                for (int j = i; j < nums.length; j++) {
                    if (j + 1 < nums.length) {
                        nums[j] = nums[j + 1];
                    }
                }
                nums[nums.length - 1] = 0;
                count++;
            } else {
                i++;
            }
        }
    }
}
