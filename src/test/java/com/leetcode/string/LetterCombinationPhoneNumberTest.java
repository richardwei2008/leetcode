package com.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

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
public class LetterCombinationPhoneNumberTest {

    @Test
    public void test_23() {
        String[] expecteds = new String[]{"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"};
        String digits = "23";
        List<String> result = new LetterCombinationPhoneNumber().letterCombinations(digits);
        Assert.assertArrayEquals(expecteds, result.toArray(new String[result.size()]));
    }


}
