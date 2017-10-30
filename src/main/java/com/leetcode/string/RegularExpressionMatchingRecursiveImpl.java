package com.leetcode.string;

/**
 * Created by Richard on 17/10/30.
 *
 * Implement regular expression matching with support for '.' and '*'.
 *
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 *
 * The matching should cover the entire input string (not partial).
 *
 * The function prototype should be:
 * bool isMatch(const char *s, const char *p)
 *
 * Some examples:
 * isMatch("aa","a") → false
 * isMatch("aa","aa") → true
 * isMatch("aaa","aa") → false
 * isMatch("aa", "a*") → true
 * isMatch("aa", ".*") → true
 * isMatch("ab", ".*") → true
 * isMatch("aab", "c*a*b") → true
 *
 *
 */
public class RegularExpressionMatchingRecursiveImpl {

    /**
     * recursive
     *
     * @param s
     * @param p
     * @return
     */
    public boolean isMatch(String s, String p) {
        if (s == null || p == null) {
            return false;
        }

        if (p.isEmpty()) {
            return s.isEmpty();
        }

        boolean firstMatch = (!s.isEmpty() &&
                (p.charAt(0) == s.charAt(0)) || p.charAt(0) == '.');

        if (p.length() >= 2 && p.charAt(1) == '*') {
            return (isMatch(s, p.substring(2)) || firstMatch && !s.isEmpty() && isMatch(s.substring(1), p));
        } else {
            return firstMatch && !s.isEmpty() && isMatch(s.substring(1), p.substring(1));
        }
    }
}
