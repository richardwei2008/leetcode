package com.leetcode.out;

import java.util.Scanner;

/**
 * Created by Richard on 17/12/11.
 *
 * https://www.hackerrank.com
 *
 * Consider a staircase of size n = 4:
 *
 *     #
 *    ##
 *   ###
 *  ####
 *
 * Observe that its base and height are both equal to n,
 * and the image is drawn using # symbols and spaces.
 * The last line is not preceded by any spaces.
 *
 * Write a program that prints a staircase of size n.
 *
 * Input Format
 *
 * A single integer, n, denoting the size of the staircase.
 *
 * Output Format
 *
 * Print a staircase of size n using # symbols and spaces.
 *
 * Note: The last line must have 0 spaces in it.
 *
 * Sample Input
 *
 * 6
 *
 * Sample Output
 *
 *       #
 *      ##
 *     ###
 *    ####
 *   #####
 *  ######
 *
 * Explanation
 *
 * The staircase is right-aligned, composed of # symbols and spaces,
 * and has a height and width of n = 6.
 *
 */
public class Staircase {

    static void staircase(int n) {

        String format = "%" + n +"s";
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < i + 1; j++) {
                sb.append("#");
            }
            System.out.println(String.format(format, sb.toString()));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
    }
}
