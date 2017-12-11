package com.leetcode.integer;

import java.util.Scanner;

/**
 * Created by Richard on 17/12/11.
 *
 * https://www.hackerrank.com
 */
public class CompareTheTriples {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Complete this function
        int[] res = new int[]{0, 0};
        int compare = compare(a0, b0);
        if (compare > 0) {
            res[0] += 1;
        } else if (compare < 0) {
            res[1] += 1;
        }
        compare = compare(a1, b1);
        if (compare > 0) {
            res[0] += 1;
        } else if (compare < 0) {
            res[1] += 1;
        }
        compare = compare(a2, b2);
        if (compare > 0) {
            res[0] += 1;
        } else if (compare < 0) {
            res[1] += 1;
        }
        return res;
    }

    private static int compare(int ai, int bi) {
        if (ai == bi) {
            return 0;
        } else if (ai > bi) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


    }
}
