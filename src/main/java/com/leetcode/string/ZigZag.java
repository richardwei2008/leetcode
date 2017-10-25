package com.leetcode.string;

/**
 * Created by Richard on 17/10/19.
 *
 * The string "PAYPALISHIRING" is written in a zigzag pattern
 * on a given number of rows like this:
 *
 * (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 *
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string text, int nRows);
 *
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 *
 */
public class ZigZag {

    public String convert(String s, int numRows) {
        if (numRows <= 0 || s == null) {
            return s;
        }
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        // 14 -> 7 column
        int numCols = this.calculateColumn(s.length(), numRows);
        char[][] matrix = this.transformToMatrix(s, numRows, numCols);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (0 != matrix[i][j]) {
                    sb.append(matrix[i][j]);
                }
            }
        }
        return sb.toString();
    }

    /**
     *
     * numRows = 3
     *
     * k=0: i=0,j=0
     * k=1: i=1,j=0
     * k=2: i=2,j=0
     * k=3: i=1,j=1
     * k=4: i=0,j=2
     * k=5: i=1,j=2
     * k=6: i=2,j=2
     * k=7: i=1,j=3
     *
     * k=i+2j
     *
     *
     *
     * @param s
     * @param numRows
     * @param numCols
     * @return
     */
    protected char[][] transformToMatrix(String s, int numRows, int numCols) {
        char[][] matrix = new char[numRows][numCols];
        for (int k = 0; k < s.length(); k++) {
            int i, j;
            j = this.calculateColumn(k + 1, numRows) - 1;
            i = k - 2 * j;
            matrix[i][j] = s.charAt(k);
        }
        return matrix;
    }

    protected int calculateColumn(int length, int numRows) {
        if (numRows <= 1) {
            return length;
        }
        if (numRows >= length) {
            return 1;
        }
        int remainder = (length % (numRows * 2 - 2));
        int remainderCols;
        if (remainder == 0) {
            remainderCols = 0;
        } else if (remainder <= numRows) {
            remainderCols = 1;
        } else {
            remainderCols = remainder - numRows + 1;
        }

        int blockCols = length / (numRows * 2 - 2) * (numRows - 1);
        int col = blockCols + remainderCols;
        return col;
    }
}
