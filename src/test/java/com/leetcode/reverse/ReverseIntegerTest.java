package com.leetcode.reverse;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Richard on 17/10/18.
 */
public class ReverseIntegerTest {

    @Test
    public void testReverseInteger_0() {
        int result = new ReverseInteger().reverse(0);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testReverseInteger_1() {
        int result = new ReverseInteger().reverse(1);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testReverseInteger_123() {
        int result = new ReverseInteger().reverse(123);
        Assert.assertEquals(321, result);
    }

    @Test
    public void testReverseInteger_negative_123() {
        int result = new ReverseInteger().reverse(-123);
        Assert.assertEquals(-321, result);
    }

    @Test
    public void testReverseInteger_1534236469() {
        int result = new ReverseInteger().reverse(1534236469);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testReverseInteger_negative_2147483648() {
        int result = new ReverseInteger().reverse(-2147483648);
        Assert.assertEquals(0, result);
    }

}
