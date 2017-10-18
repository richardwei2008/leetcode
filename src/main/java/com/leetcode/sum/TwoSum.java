package com.leetcode.sum;

import java.util.HashMap;

/**
 * Created by Richard on 17/3/14.
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("Array of integers should not less than 2 elements");
        }
        int[] indices = new int[2];

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                indices[1] = i;
                indices[0] = map.get(target - nums[i]);
                return indices;
            }
            map.put(nums[i], i);
        }
        return indices;
    }


}
