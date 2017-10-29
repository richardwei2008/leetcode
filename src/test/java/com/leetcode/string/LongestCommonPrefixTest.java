package com.leetcode.string;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Richard on 17/10/29.
 */
public class LongestCommonPrefixTest {

    @Test
    public void testLongestCommonPrefix() {
        String[] strs = new String[]{"leet", "leetCode", "leeta", "lee"};
        String result = new LongestCommonPrefix().longestCommonPrefix(strs);
        Assert.assertEquals("lee", result);
    }
}
