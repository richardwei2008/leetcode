package com.leetcode.integer;

/**
 * Created by Richard on 17/12/8.
 *
 * Divide two integers without using multiplication, division and mod operator.
 * If it is overflow, return MAX_INT
 *
 */
public class DivideTwoIntegers {

    public int divide(int dividend, int divisor) {
        int sum = 0;
        int count = 0;
        if (divisor == 0) {
            return Integer.MAX_VALUE;
        }
        if (dividend == 0) {
            return 0;
        }
        if (Integer.MIN_VALUE == dividend && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if (Integer.MAX_VALUE == dividend && divisor == 1) {
            return Integer.MAX_VALUE;
        }
        if (Integer.MIN_VALUE == dividend && divisor == 1) {
            return Integer.MIN_VALUE;
        }
        if (Integer.MAX_VALUE == dividend && divisor == -1) {
            return -dividend;
        }
        if ((dividend > 0 && divisor > 0)
                || (dividend < 0 && divisor < 0)) {
            while (Math.abs(dividend - sum) >= Math.abs(divisor)) {
                sum += divisor;
                count++;
            }
        }
        if ((dividend < 0 && divisor > 0)
                || (dividend > 0 && divisor < 0)) {
            while (Math.abs(dividend) - Math.abs(sum) >= Math.abs(divisor)) {
                sum -= divisor;
                count--;
            }
        }
        return count;
    }
}
