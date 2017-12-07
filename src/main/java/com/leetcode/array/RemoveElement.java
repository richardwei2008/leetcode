package com.leetcode.array;

/**
 * Created by Richard on 17/12/7.
 *
 * Given an array and a value, remove all instances of that value
 * in-place and return the new length.
 *
 * DO not allocate extra space for another array,
 * you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * The order of elements can be changed.
 * It doesn't matter what you leave beyond the new length.
 *
 * Example:
 *
 *  Given nums = [3, 2, 2, 3], val = 3,
 *  Your function should return length = 2,
 *  with the first two elements of nums being 2.
 *
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (null == nums) {
            return 0;
        }
        int duplicates = 0;
        for (int i = 0; i < nums.length - duplicates;) {
            if (val == nums[i]) {
                duplicates++;
                // move 1 forward
                for (int j = i + 1; j < nums.length; j++) {
                    nums[j - 1] = nums[j];
                }
            } else {
                i++;
            }
        }
        return nums.length - duplicates;
    }
}
