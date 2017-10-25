package com.leetcode.reverse;

/**
 * Created by Richard on 17/10/18.
 *
 * Reverse digits of an integer.
 *
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 *
 */
public class ReverseInteger {

    public int reverse(int x) {
        int revertedNumber = 0;
        while (x != 0) {
            if (Integer.MAX_VALUE / 10 < Math.abs(revertedNumber)) {
                return 0;
            }
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return revertedNumber;
    }
}
