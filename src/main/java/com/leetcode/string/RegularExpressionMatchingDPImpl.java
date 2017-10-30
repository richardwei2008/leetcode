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
public class RegularExpressionMatchingDPImpl {

    /**
     * dynamic programming
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

        boolean[][] dp = new boolean[s.length()+1][p.length()+1];
        dp[s.length()][p.length()] = true;

        for (int i = s.length(); i >= 0 ; i--) {
            for (int j = p.length() - 1; j >= 0 ; j--) {
                boolean firstMatch = (i < s.length() &&
                                        (p.charAt(j) == s.charAt(i) ||
                                        p.charAt(j) == '.'));
                if (j + 1 < p.length() && p.charAt(j + 1) == '*'){
                    dp[i][j] = dp[i][j+2] || firstMatch && dp[i+1][j];
                } else {
                    dp[i][j] = firstMatch && dp[i+1][j+1];
                }
            }
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                System.out.print((dp[i][j]?1:0) + " ");
            }
            System.out.println();
        }
        return dp[0][0];
    }
}
