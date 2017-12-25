package com.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Richard on 17/12/25.
 *
 * Given n pairs of parentheses, write a function
 * to generate all combinations of well-formed parentheses.
 *
 * For example, given n = 3, a solution set is:
 *
 * [
 *      "((()))"
 *      "(()())"
 *      "(())()"
 *      "()(())"
 *      "()()()"
 * ]
 *
 */
public class GenerateParenthesesTest {

    @Test
    public void testGenerateParentheses() {
        int n = 3;

        List<String> list = new GenerateParentheses().generateParentheses(n);

        String[] expected = new String[]{
                "((()))",
                "(()())",
                "(())()",
                "()(())",
                "()()()"
        };

        Assert.assertArrayEquals(expected, list.stream().toArray(String[]::new));
    }
}
