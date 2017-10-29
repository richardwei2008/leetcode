package com.leetcode.integer;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Richard on 17/10/29.
 */
public class IntToRomanTest {

    @Test
    public void testIntToRoman_3() {
        String result = new IntToRoman().intToRoman(3);
        Assert.assertEquals("III", result);
    }

    @Test
    public void testIntToRoman_3999() {
        String result = new IntToRoman().intToRoman(3999);
        Assert.assertEquals("MMMCMXCIX", result);
    }

}
