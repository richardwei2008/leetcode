package com.leetcode.integer;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Richard on 17/12/11.
 *
 * https://www.hackerrank.com
 *
 * Given two integers, l and r, print all the odd numbers between l and r (l and r inclusive)
 *
 * Complete the oddNumbers function in the editor below. It has 2 parameters:
 *
 * 1. An integer, l, denoting the left part of the range.
 * 2. An integer, r, denoting the right part of the range.
 *
 */
public class OddNumbers {

    static int[] oddNumbers(int l, int r) {
        if (r < l) {
            return new int[]{};
        }
        int[] res = new int[(r - l) / 2 + 1];
        int count = 0;
        for (int i = l; i <= r; i++) {
            if (i % 2 == 1) {
                res[count++] = i;
            }
        }
        return Arrays.copyOf(res, count);
    }

    public static void main(String[] args) throws IOException {
        int[] res1 = oddNumbers(3, 9);
        for (int i = 0; i < res1.length; i++) {
            System.out.println(res1[i]);
        }

        int[] res2 = oddNumbers(2, 5);
        for (int i = 0; i < res2.length; i++) {
            System.out.println(res2[i]);
        }

    }
}
