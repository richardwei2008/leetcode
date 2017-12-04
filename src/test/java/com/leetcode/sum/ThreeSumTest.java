package com.leetcode.sum;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Richard on 17/12/4.
 */
public class ThreeSumTest {


    @Test
    public void testBaseCase() {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};

        List<List<Integer>> list = new ThreeSum().threeSum(nums);

        // assert [-1, 0, 1] at list[0]
        int[] expected1 = new int[]{-1, -1, 2};
        Assert.assertArrayEquals(expected1, toIntArray(list.get(0)));

        // assert [-1, -1, 2] at list[1]
        int[] expected2 = new int[]{-1, 0, 1};
        Assert.assertArrayEquals(expected2, toIntArray(list.get(1)));


    }

    private static int[] toIntArray(List<Integer> integerList) {
        int[] intArray = new int[integerList.size()];
        for (int i = 0; i < integerList.size(); i++) {
            intArray[i] = integerList.get(i);
        }
        return intArray;
    }
}
