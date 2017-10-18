package com.leetcode.palindrome;

import com.leetcode.palindrome.PalindromeNumber;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Richard on 17/10/18.
 */
public class PalindromeNumberTest {

    @Test
    public void testPalindromeNumber_12321() {
        boolean result = new PalindromeNumber().isPalindrome(12321);
        Assert.assertEquals(true, result);
    }

    @Test
    public void testPalindromeNumber_1221() {
        boolean result = new PalindromeNumber().isPalindrome(1221);
        Assert.assertEquals(true, result);
    }

    @Test
    public void testPalindromeNumber_123421() {
        boolean result = new PalindromeNumber().isPalindrome(123421);
        Assert.assertEquals(false, result);
    }
}
