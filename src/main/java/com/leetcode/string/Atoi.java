package com.leetcode.string;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Richard on 17/10/18.
 *
 * Implement atoi to convert a string to an integer.
 *
 * Hint: Carefully consider all possible input cases.
 * If you want a challenge, please do not see below
 * and ask yourself what are the possible input cases.
 *
 * Notes: It is intended for this problem to be specified vaguely
 * (ie, no given input specs).
 * You are responsible to gather all the input requirements up front.
 *
 * Requirements for atoi:
 *
 * The function first discards as many whitespace characters
 * as necessary until the first non-whitespace character is found.
 *
 * Then, starting from this character, takes an optional initial plus
 * or minus sign followed by as many numerical digits as possible,
 * and interprets them as a numerical value.
 *
 * The string can contain additional characters after those that
 * form the integral number, which are ignored and have no effect
 * on the behavior of this function.
 *
 * If the first sequence of non-whitespace characters in str is not a valid integral number,
 * or if no such sequence exists because either str is empty
 * or it contains only whitespace characters,
 * no conversion is performed.
 *
 * If no valid conversion could be performed,
 * a zero value is returned.
 * If the correct value is out of the range of representable values,
 * INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
 *
 */
public class Atoi {
    public static char MINUS = '-';
    public static char PLUS = '+';
    public static char[] arr = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public static List<Character> list = new ArrayList<Character>();

    static {
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
    }

    public int myAtoi(String str) {
        if (null == str) {
            return 0;
        }
        str = str.trim();
        if ("".equals(str)) {
            return 0;
        }
        int i = 0;
        if (str.charAt(0) == MINUS || str.charAt(0) == PLUS) {
            i++;
        } else if (list.indexOf(str.charAt(0)) < 0) {
            return 0;
        }
        int myAtoi = 0;
        for (; i < str.length(); i++) {
            int index = list.indexOf(str.charAt(i));
            if (index < 0) {
                break;
            } else {
                if (Integer.MAX_VALUE / 10 < myAtoi) {
                    if (str.charAt(0) == MINUS) {
                        return Integer.MIN_VALUE;
                    } else {
                        return Integer.MAX_VALUE;
                    }
                } else if (Integer.MAX_VALUE / 10 == myAtoi) {
                    if (str.charAt(0) == MINUS && (index >= 8)) {
                        return Integer.MIN_VALUE;
                    } else if (index > 7) {
                        return Integer.MAX_VALUE;
                    } else {
                        myAtoi = myAtoi * 10 + index;
                    }
                } else {
                    myAtoi = myAtoi * 10 + index;
                }
            }
        }
        if (str.charAt(0) == MINUS) {
            return 0 - myAtoi;
        } else {
            return myAtoi;
        }

    }
}
