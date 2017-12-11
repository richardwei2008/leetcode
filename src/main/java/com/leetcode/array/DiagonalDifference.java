package com.leetcode.array;

import java.util.Scanner;

/**
 * Created by Richard on 17/12/11.
 *
 * https://www.hackerrank.com
 *
 * Give a square matrix of size NxN,
 * calculate the absolute difference between the sums of its diagonals.
 *
 * Input Format
 *
 * The first line contains a single integer, N.
 * The next N lines denote the matrix's rows, with each line containing N
 * space-separated integers describing the columns.
 *
 * Constraints
 *
 * -100 <= Elements in the matrix <= 100
 *
 * Output Format
 *
 * Print the absolute difference between
 * the two sums of the matrix's diagonals as a single integer.
 *
 * Sample Input
 *
 * 3
 * 11 2 4
 * 4 5 6
 * 10 8 -12
 *
 * Sample Output
 *
 * 15
 *
 * Explanation
 *
 * The primary diagonal is:
 *
 * 11
 *      5
 *          -12
 *
 * Sum across the primary diagonal: 11 + 5 - 12 = 4
 *
 * The secondary diagonal is:
 *
 *          4
 *      5
 *  10
 *
 * Sum across the secondary diagonal: 4 + 5 + 10 = 19
 * Difference: |4 - 19| = 15
 *
 *
 */
public class DiagonalDifference {

    static int difference(int n, int[][] a) {
        int diff;
        int primary = 0;
        int secondary = 0;
        for (int i = 0; i < n; i++) {
            primary += a[i][i];
            secondary += a[n-1-i][i];
        }
        diff = Math.abs(primary - secondary);
        return diff;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        long result = difference(n, a);
        System.out.println(result);
    }
}
