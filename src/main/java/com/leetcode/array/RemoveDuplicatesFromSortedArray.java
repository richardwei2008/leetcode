package com.leetcode.array;

/**
 * Created by Richard on 17/12/7.
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int length = 0;
        if (null == nums) {
            return length;
        }
        if (nums.length == 1) {
            length = nums.length;
            return length;
        }
        length = 1;
        int duplicates = 0;
        for (int i = 1; i < nums.length-duplicates; ) {
            if (nums[i-1] == nums[i]) {
                int key = nums[i - 1];
                int move = 0;
                // count duplicates
                for (int j = i; j < nums.length; j++) {
                    if (key == nums[j]) {
                        move++;
                    } else {
                        break;
                    }
                }
                if (move > 0) {
                    for (int j = i + move; j < nums.length; j++) {
                        nums[j - move] = nums[j];
                    }
                    duplicates += move;
                }
            } else {
                length++;
                i++;
            }
        }
        return length;
    }
}
