package com.leetcode.integer;


/**
 * Created by Richard on 17/12/8.
 *
 * Divide two integers without using multiplication, division and mod operator.
 * If it is overflow, return MAX_INT
 *
 */
public class DivideTwoIntegersDemo {

    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            return Integer.MAX_VALUE;
        }
        if (dividend == 0) {
            return 0;
        }

        boolean isMinus= ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0));
        long ret = 0;
        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);
        long c = 1;
        long sub = ldivisor;

        while (ldividend >= ldivisor) {
            if(ldividend >= sub) {
                ldividend -= sub;
                ret += c;
                sub = (sub<<1);
                c = (c<<1);
            } else {
                sub = (sub>>1);
                c = (c>>1);
            }
        }

        if (ret > Integer.MAX_VALUE){ //Handle overflow.
            return (!isMinus) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            return (!isMinus) ? (int) (ret) : (int) (-ret);
        }
    }
}
