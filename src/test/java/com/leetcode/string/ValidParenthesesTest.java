package com.leetcode.string;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Richard on 17/12/23.
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 *
 * The brackets must close in the correct order,
 * "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class ValidParenthesesTest {

    @Test
    public void testValidParentheses_case1() {
        String s = "()";

        boolean result = new ValidParentheses().isValid(s);
        Assert.assertEquals(true, result);
    }

    @Test
    public void testValidParentheses_case2() {
        String s = "()[]{}";

        boolean result = new ValidParentheses().isValid(s);
        Assert.assertEquals(true, result);
    }

    @Test
    public void testValidParentheses_case3() {
        String s = "(]";

        boolean result = new ValidParentheses().isValid(s);
        Assert.assertEquals(false, result);
    }

    @Test
    public void testValidParentheses_case4() {
        String s = "([)]";

        boolean result = new ValidParentheses().isValid(s);
        Assert.assertEquals(false, result);
    }

    @Test
    public void testValidParentheses_case5() {
        String s = "([])";

        boolean result = new ValidParentheses().isValid(s);
        Assert.assertEquals(true, result);
    }

    @Test
    public void testValidParentheses_case6() {
        String s = "{()[]}";

        boolean result = new ValidParentheses().isValid(s);
        Assert.assertEquals(true, result);
    }
}
