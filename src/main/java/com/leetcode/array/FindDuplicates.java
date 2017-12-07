package com.leetcode.array;

import java.util.ArrayList;
import java.util.LinkedList;
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
public class FindDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];
            if (nums[Math.abs(nums[i])-1] > 0) {
                if (!res.contains(nums[i])) {
                    res.add(Math.abs(nums[i]));
                }

            }
        }
        return res;
    }
}
