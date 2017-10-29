package com.leetcode.string;

/**
 * Created by Richard on 17/10/29.
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String longest = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String a = strs[i];
            while (a.indexOf(longest) != 0) {
                longest = longest.substring(0, longest.length() - 1);
                if (longest.isEmpty()) {
                    return "";
                }
            }
        }
        return longest;
    }
}
