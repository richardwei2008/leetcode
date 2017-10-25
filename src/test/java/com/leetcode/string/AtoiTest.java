package com.leetcode.string;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Richard on 17/10/18.
 */
public class AtoiTest {

    @Test
    public void testAtoi_21474836470() {
        int result = new Atoi().myAtoi("21474836470");
        Assert.assertEquals(Integer.MAX_VALUE, result);
    }

    @Test
    public void testAtoi_negative_21474836480() {
        int result = new Atoi().myAtoi("-21474836480");
        Assert.assertEquals(Integer.MIN_VALUE, result);
    }

    @Test
    public void testAtoi_space_2147() {
        int result = new Atoi().myAtoi("   2147");
        Assert.assertEquals(2147, result);
    }

    @Test
    public void testAtoi_positive_2147() {
        int result = new Atoi().myAtoi("+2147");
        Assert.assertEquals(2147, result);
    }

    @Test
    public void testAtoi_negative_2147() {
        int result = new Atoi().myAtoi("-2147");
        Assert.assertEquals(-2147, result);
    }

    @Test
    public void testAtoi_failed_case() {
        int result = new Atoi().myAtoi("  -0012a42");
        Assert.assertEquals(-12, result);
    }

    @Test
    public void testAtoi_negative_2147483647() {
        int result = new Atoi().myAtoi("  -2147483647");
        Assert.assertEquals(-2147483647, result);
    }

    @Test
    public void testAtoi_2147483648() {
        int result = new Atoi().myAtoi("2147483648");
        Assert.assertEquals(2147483647, result);
    }
}
