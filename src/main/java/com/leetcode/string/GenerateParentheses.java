package com.leetcode.string;

import java.util.LinkedList;
import java.util.List;

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
public class GenerateParentheses {

    public List<String> generateParentheses(int n) {
        List<String> list = new LinkedList<>();
        generate("", list, n, n);
        return list;
    }

    public void generate(String seq, List<String> list, int left, int right){
        if(left > right){
            return;
        }
        if(left > 0){
            generate( seq + "(" , list, left-1, right);
        }
        if(right > 0){
            generate( seq + ")" , list, left, right-1);
        }
        if(left == 0 && right == 0){
            list.add(seq);
            return;
        }
    }
}
