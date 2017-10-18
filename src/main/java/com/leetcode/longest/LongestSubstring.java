package com.leetcode.longest;

import java.util.HashSet;

/**
 * Created by Richard on 17/3/15.
 *
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 *
 * Given "bbbbb", the answer is "b", with the length of 1.
 *
 * Given "pwwkew", the answer is "wke", with the length of 3.
 *
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 */
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int indexer = 0;
        while (indexer < s.length()) {
            int lengthOfLongest = 0;
            HashSet<Character> set = new HashSet<Character>();
            for (int j = indexer; j < s.length(); j++) {
                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j));
                    lengthOfLongest++;
                } else {
                    break;
                }
            }
            if (result < lengthOfLongest) {
                result = lengthOfLongest;
            }
            int pointer1 = indexer;
            int pointer2 = indexer + lengthOfLongest;
            while (pointer1 < s.length() && pointer2 < s.length()
                    && pointer1 < indexer + lengthOfLongest
                    && s.charAt(pointer1) == s.charAt(pointer2)) {
                pointer1++;
                pointer2++;
            }
            if ((pointer1 == indexer + lengthOfLongest)
                    && (pointer2 == indexer + 2*lengthOfLongest)) {
                indexer = indexer + lengthOfLongest;
            } else {
                indexer++;
            }
        }
        return result;
    }
}






