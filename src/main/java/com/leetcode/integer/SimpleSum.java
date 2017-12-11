package com.leetcode.integer;

import java.util.Scanner;

/**
 * Created by Richard on 17/12/11.
 *
 * https://www.hackerrank.com
 */
public class SimpleSum {

    static int solveMeFirst(int a, int b) {
        // Hint: Type return a+b; below
        return a+b;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}
