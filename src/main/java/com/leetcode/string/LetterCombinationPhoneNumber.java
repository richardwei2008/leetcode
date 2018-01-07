package com.leetcode.string;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Richard on 18/1/6.
 *
 * Given a digit string, return all possible letter combinations that the number could represent.
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 *
 *  1       2       3
 *          abc     def
 *  4       5       6
 *  ghi     jkl     mno
 *  7       8       9
 *  pqrs    tuv     wxyz
 *          0
 *
 *
 *  Input: Digit string "23"
 *  Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 *
 *  Note:
 *
 *  Although the above answer is in lexicographical order,
 *  your answer could be in any order you want.
 *
 */
public class LetterCombinationPhoneNumber {


    public static String[] DIGITS
            = new String[]{" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<>();
        ans.add("");
        for(int i =0; i < digits.length(); i++){
            int x = Character.getNumericValue(digits.charAt(i));
            while(ans.peek().length() == i) {
                String t = ans.remove();
                for(char s : DIGITS[x].toCharArray()) {
                    ans.add(t + s);
                }

            }
        }
        return ans;
    }

}
