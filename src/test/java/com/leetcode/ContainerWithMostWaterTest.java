package com.leetcode;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Richard on 17/10/30.
 */
public class ContainerWithMostWaterTest {

    @Test
    public void testContainerWithMostWater_1_3() {
        int[] height = new int[]{1, 3};
        int result = new ContainerWithMostWater().maxArea(height);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testContainerWithMostWater_3_1() {
        int[] height = new int[]{3, 4};
        int result = new ContainerWithMostWater().maxArea(height);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testContainerWithMostWater_3_1_2_5() {
        int[] height = new int[]{1, 3, 1, 2, 5};
        int result = new ContainerWithMostWater().maxArea(height);
        Assert.assertEquals(9, result);
    }
}
