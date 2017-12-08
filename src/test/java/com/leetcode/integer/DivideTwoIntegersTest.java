package com.leetcode.integer;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Richard on 17/12/8.
 *
 * Divide two integers without using multiplication, division and mod operator.
 * If it is overflow, return MAX_INT
 *
 */
public class DivideTwoIntegersTest {

    @Test
    public void testDivideTwoIntegers() {
        int dividend = 11;
        int divisor = 2;
        int actual = new DivideTwoIntegers().divide(dividend, divisor);
        int expected = dividend / divisor;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDivideTwoIntegers_wrongAnswer1() {
        int dividend = 1;
        int divisor = 1;
        int actual = new DivideTwoIntegers().divide(dividend, divisor);
        int expected = dividend / divisor;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDivideTwoIntegers_wrongAnswer2() {
        int dividend = -1;
        int divisor = 1;
        int actual = new DivideTwoIntegers().divide(dividend, divisor);
        int expected = dividend / divisor;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDivideTwoIntegers_wrongAnswer3() {
        int dividend = -2147483648;
        int divisor = 2;
        int actual = new DivideTwoIntegers().divide(dividend, divisor);
        int expected = dividend / divisor;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDivideTwoIntegers_negative_positive() {
        int dividend = -11;
        int divisor = 2;
        int actual = new DivideTwoIntegers().divide(dividend, divisor);
        int expected = dividend / divisor;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDivideTwoIntegers_negative_negative() {
        int dividend = -11;
        int divisor = -2;
        int actual = new DivideTwoIntegers().divide(dividend, divisor);
        int expected = dividend / divisor;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDivideTwoIntegers_positive_negative() {
        int dividend = 11;
        int divisor = -2;
        int actual = new DivideTwoIntegers().divide(dividend, divisor);
        int expected = dividend / divisor;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDivideTwoIntegers_boundary1() {
        int dividend = -2147483648;
        int divisor = -1;
        int actual = new DivideTwoIntegers().divide(dividend, divisor);
        Assert.assertEquals(Integer.MAX_VALUE, actual);
    }

    @Test
    public void testDivideTwoIntegers_timeExceed1() {
        int dividend = 2147483647;
        int divisor = 1;
        int actual = new DivideTwoIntegers().divide(dividend, divisor);
        Assert.assertEquals(Integer.MAX_VALUE, actual);
    }

    @Test
    public void testDivideTwoIntegers_boundary2() {
        int dividend = -2147483648;
        int divisor = 1;
        int actual = new DivideTwoIntegers().divide(dividend, divisor);
        Assert.assertEquals(Integer.MIN_VALUE, actual);
    }

    @Test
    /**
     * Still time exceed
     */
    public void testDivideTwoIntegers_timeExceed2() {
        int dividend = 2147483647;
        int divisor = 2;
        int actual = new DivideTwoIntegers().divide(dividend, divisor);
        int expected = dividend / divisor;
        Assert.assertEquals(expected, actual);
    }
}
