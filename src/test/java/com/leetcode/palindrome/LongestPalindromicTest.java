package com.leetcode.palindrome;

import com.leetcode.palindrome.LongestPalindromic;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Richard on 17/10/17.
 */
public class LongestPalindromicTest {


    @Test
    public void testLongestPalindrome_babad() {
        String result = new LongestPalindromic().longestPalindrome("babad");
        Assert.assertEquals("bab", result);
    }

    @Test
    public void testLongestPalindrome_cbbd() {
        String result = new LongestPalindromic().longestPalindrome("cbbd");
        Assert.assertEquals("bb", result);
    }

    @Test
    public void testLongestPalindrome_dabadaba() {
        String result = new LongestPalindromic().longestPalindrome("dabadaba");
        Assert.assertEquals("abadaba", result);
    }

    @Test
    public void testLongestPalindrome_eabccbad() {
        String result = new LongestPalindromic().longestPalindrome("eabccbad");
        Assert.assertEquals("abccba", result);
    }

    @Test
    public void testLongestPalindrome_a() {
        String result = new LongestPalindromic().longestPalindrome("a");
        Assert.assertEquals("a", result);
    }

    @Test
    public void testLongestPalindrome_aa() {
        String result = new LongestPalindromic().longestPalindrome("aa");
        Assert.assertEquals("aa", result);
    }

    @Test
    public void testLongestPalindrome_daae() {
        String result = new LongestPalindromic().longestPalindrome("daae");
        Assert.assertEquals("aa", result);
    }

    @Test
    public void testLongestPalindrome_daaae() {
        String result = new LongestPalindromic().longestPalindrome("daaae");
        Assert.assertEquals("aaa", result);
    }

    @Test
    public void testPreProcess_a() {
        char[] result = new LongestPalindromic().preProcess("a");
        Assert.assertEquals("#a#", String.valueOf(result));
    }

    @Test
    public void testPreProcess_daae() {
        char[] result = new LongestPalindromic().preProcess("daae");
        Assert.assertEquals("#d#a#a#e#", String.valueOf(result));
    }
}
