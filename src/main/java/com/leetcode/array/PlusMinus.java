package com.leetcode.array;

import java.util.Scanner;

/**
 * Created by Richard on 17/12/11.
 *
 * https://www.hackerrank.com
 *
 * Given an array of integers, calculate which fraction of its elements are positive,
 * which fraction of its elements are negative, and which fraction of its elements are zeroes,
 * respectively. Print the decimal value of each fraction on a new line.
 *
 * Note: This challenge introduces precision problems.
 * The test cases are scaled to six decimal places,
 * though answers with absolute error of up to 10^-4 are acceptable.
 *
 * Input Format
 *
 * The first line contains an integer, N, denoting the size of the array.
 * The second line contains N space-separated integers describing an array of numbers
 * (a0, a1, a2, ... , an-1)
 *
 * Output Format
 *
 * You must print the following 3 lines:
 *
 * 1. A decimal representing of the fraction of positive numbers in the array compared to its size.
 * 2. A decimal representing of the fraction of negative numbers in the array compared to its size.
 * 3. A decimal representing of the fraction of zeroes in the array compared to its size.
 *
 * Sample Input
 * 6
 * -4 3 -9 0 4 1
 *
 * Sample Output
 * 0.500000
 * 0.333333
 * 0.166667
 *
 * Explanation
 *
 * There are 3 positive numbers, 2 negative numbers, and 1 zero in the array.
 * The respective fraction of positive numbers, negative numbers and zeroes are
 * 3/6 = 0.500000, 2/6 = 0.333333 and 1/6 = 0.166667, respectively.
 *
 *
 *
 */
public class PlusMinus {

    static double[] plusMinus(int n, int[] arr) {
        double[] fraction = new double[3];
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            }
        }
        fraction[0] = positive / (double) n;
        fraction[1] = negative / (double) n;
        fraction[2] = (n - positive - negative) / (double) n;
        return fraction;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        double[] fraction = plusMinus(n, arr);
        for (int i = 0; i < fraction.length; i++) {
            System.out.println(fraction[i]);
        }

    }
}
