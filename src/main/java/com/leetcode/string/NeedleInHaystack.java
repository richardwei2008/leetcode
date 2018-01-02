package com.leetcode.string;

/**
 * Created by Richard on 18/1/2.
 *
 * Implement strStr()
 *
 * Return the index of the first occurrence of needle in haystack
 * or -1 if needle is not part of haystack.
 *
 * Example 1:
 *
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 *
 * Example 2:
 *
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 */
public class NeedleInHaystack {

    public int strStr(String haystack, String needle) {
        if (null == haystack || null == needle) {
            return -1;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        if (needle.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < haystack.length(); i++) {
            int p = i;
            for (int j = 0; j < needle.length(); j++) {
                if (p >= haystack.length() || haystack.charAt(p) != needle.charAt(j)) {
                    break;
                }
                p++;
            }
            if (p - i == needle.length()) {
                return i;
            }
        }
        return -1;
    }
}
