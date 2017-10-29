package com.leetcode.integer;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Richard on 17/10/29.
 */
public class RomanToIntTest {

    @Test
    public void testRomanToInt_III() {
        int result = new RomanToInt().romanToInt("III");
        Assert.assertEquals(3, result);
    }
}
