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

    public List<Integer> findDuplicates2(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            // put nums[i] to it's right place if the right place is not already nums[i]
            while(i != nums[i]-1 && nums[i] != nums[nums[i]-1]) {
                int temp = nums[i];
                nums[i] = nums[nums[i]-1];
                nums[temp-1] = temp;
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(i != nums[i]-1 && !result.contains(nums[i])) {
                result.add(nums[i]);
            }
        }
        return result;
    }
}
