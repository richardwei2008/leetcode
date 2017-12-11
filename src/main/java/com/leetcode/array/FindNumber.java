package com.leetcode.array;

import java.io.IOException;

/**
 * Created by Richard on 17/12/11.
 *
 * https://www.hackerrank.com
 */
public class FindNumber {

    static String findNumber(int[] arr, int k) {
        if (null == arr) {
            return "NO";
        }
        for (int i = 0; i < arr.length; i++) {
            if (k == arr[i]) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) throws IOException {
        int[] arr = new int[]{2, 3, 1};
        String res = findNumber(arr, 5);
        System.out.println(res == "NO");
    }
}
