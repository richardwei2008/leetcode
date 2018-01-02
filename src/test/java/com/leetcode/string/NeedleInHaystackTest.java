package com.leetcode.string;

import junit.framework.Assert;
import org.junit.Test;

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
public class NeedleInHaystackTest {

    @Test
    public void testStrStr_pass() {
        String haystack = "hello";
        String needle = "ll";
        int index = new NeedleInHaystack().strStr(haystack, needle);
        Assert.assertEquals(2, index);
    }

    @Test
    public void testStrStr_fail() {
        String haystack = "aaaaa";
        String needle = "bba";
        int index = new NeedleInHaystack().strStr(haystack, needle);
        Assert.assertEquals(-1, index);
    }

    @Test
    public void testStrStr_outOfRange() {
        String haystack = "mississippi";
        String needle = "issipi";
        int index = new NeedleInHaystack().strStr(haystack, needle);
        Assert.assertEquals(-1, index);
    }
}
