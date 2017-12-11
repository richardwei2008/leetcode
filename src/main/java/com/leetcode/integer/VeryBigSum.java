package com.leetcode.integer;

import java.util.Scanner;

/**
 * Created by Richard on 17/12/11.
 *
 * https://www.hackerrank.com
 *
 * Input Format
 *
 * The first line of the input consists of an integer N.
 * The next line contains N space-separated integers contained in the array
 *
 * Output Format
 *
 * Print a single value equal to the sum of the elements in the array.
 *
 * Constraints
 *
 * 1 <= N <= 10
 * 0 <= A[i] <= 10^10
 *
 * Sample Input
 * 5
 * 1000000001
 * 1000000002
 * 1000000003
 * 1000000004
 * 1000000005
 *
 * Output
 * 5000000015
 *
 * Note
 * The range of the 32-bit integer is (-2^31) to (2^31 - 1) or [-2147483648, 2147483647]
 *
 */
public class VeryBigSum {

    static long aVeryBigSum(int n, long[] ar) {
        // Complete this function
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if ((sum > 0 && Long.MAX_VALUE - sum < ar[i])
                    || (sum < 0 && Long.MIN_VALUE - sum > ar[i])) {
                throw new IllegalArgumentException("Exceed Long type boundary");
            }
            sum += ar[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextLong();
        }
        long result = aVeryBigSum(n, ar);
        System.out.println(result);
    }
}
