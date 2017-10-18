package com.leetcode.palindrome;

import java.util.LinkedList;

import static java.lang.Math.min;

/**
 * Created by Richard on 17/10/17.
 *
 * Given a string s, find the longest palindromic substring in s.
 * You may assume that the maximum length of s is 1000.
 *
 * Example:
 *
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 *
 * Example:
 *
 * Input: "cbbd"
 * Output: "bb"
 *
 */
public class LongestPalindromic {

    public String longestPalindrome(String s) {
        if (null == s) {
            return "";
        }
        if (s.length() > 1000) {
            throw new IllegalArgumentException("The maximum length of s should be 1000");
        }
        char[] Q = preProcess(s);

        int c = 0, r = 0;                // current center, right limit

        // P[i] = length of longest palindromic substring of t, centered at i
        int[] P = new int[Q.length];
        for (int i = 1; i < Q.length - 1; i++) {
            // find the corresponding letter in the palidrome subString
            int iMirror = c - (i - c);

            if(r > i) {
                P[i] = min(r - i, P[iMirror]);
            }

            // expanding around center i
            while ((i - 1 - P[i]) >= 0 && (i + 1 + P[i]) < Q.length
                    && Q[i + 1 + P[i]] == Q[i - 1 - P[i]]){
                P[i]++;
            }

            // Update c,r in case if the palindrome centered at i expands past r,
            if (i + P[i] > r) {
                c = i;              // next center = i
                r = i + P[i];
            }
        }

        // Find the longest palindrome length in p.

        int maxPalindrome = 0;
        int centerIndex = 0;

        for (int i = 1; i < Q.length - 1; i++) {

            if (P[i] > maxPalindrome) {
                maxPalindrome = P[i];
                centerIndex = i;
            }
        }

        System.out.println("Max Palindrome: " + maxPalindrome);
        String palindrome = s.substring((centerIndex - maxPalindrome) / 2, (centerIndex + maxPalindrome) / 2);
        System.out.println("Palindrome: " + palindrome);
        return palindrome;
    }

    protected char[] preProcess(String s) {
        // abc
        // #a#b#c#
        char[] sequence = new char[s.length()*2 + 1];
        sequence[0] = '#';
        for (int i = 0; i < s.length(); i++) {
            sequence[2*i + 1] = s.charAt(i);
            sequence[2*i + 2] = '#';
        }
        return sequence;
    }
}
