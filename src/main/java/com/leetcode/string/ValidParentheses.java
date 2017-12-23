package com.leetcode.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by Richard on 17/12/23.
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 *
 * The brackets must close in the correct order,
 * "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class ValidParentheses {

    static Map<Character, Character> maps = new HashMap<>();

    static {
        maps.put('(', ')');
        maps.put('[', ']');
        maps.put('{', '}');
    }

    public boolean isValid(String s) {
        if (null == s || s.isEmpty()) {
            return false;
        }
        if (s.length() % 2 == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        int i = 0;
        while (i < s.length()) {
            Character left = null;
            if (!stack.isEmpty()) {
                left = stack.peek();
            }
            Character right = maps.get(left);
            Character c = s.charAt(i);
            if (right != null && right.equals(c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
            i++;
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
