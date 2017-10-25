package com.leetcode.string;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Richard on 17/10/19.
 */
public class ZigZagTest {

    /**
     * P   A   H   N
     * A P L S I I G
     * Y   I   R
     */
    @Test
    public void testZigZag_PAYPALISHIRING_3() {
        String result = new ZigZag().convert("PAYPALISHIRING", 3);
        Assert.assertEquals("PAHNAPLSIIGYIR", result);
    }

    @Test
    public void testZigZag_PAYPALISHIRING_1() {
        String result = new ZigZag().convert("PAYPALISHIRING", 1);
        Assert.assertEquals("PAYPALISHIRING", result);
    }

    /**
     * P Y A I H R N
     * A P L S I I G
     *
     */
    @Test
    public void testZigZag_PAYPALISHIRING_2() {
        String result = new ZigZag().convert("PAYPALISHIRING", 2);
        Assert.assertEquals("PYAIHRNAPLSIIG", result);
    }

    @Test
    public void testZigZag_PAYPALISHIRING_14() {
        String result = new ZigZag().convert("PAYPALISHIRING", 14);
        Assert.assertEquals("PAYPALISHIRING", result);
    }

    /**
     * P     I     N
     * A   L S   I G
     * Y A   H R
     * P     I
     *
     */
    @Test
    public void testZigZag_PAYPALISHIRING_4() {
        String result = new ZigZag().convert("PAYPALISHIRING", 4);
        Assert.assertEquals("PINALSIGYAHRPI", result);
    }

    /**
     * M     I     A
     * Y   E S   H R   I
     * N M   R C   D E
     * A     I     W
     */
    @Test
    public void testZigZag_MYNAMEISRICHARDWEI_4() {
        String result = new ZigZag().convert("MYNAMEISRICHARDWEI", 4);
        Assert.assertEquals("MIAYESHRINMRCDEAIW", result);
    }

    @Test
    public void testZigZagColumn_PAYPALISHIRING_3() {
        int col = new ZigZag().calculateColumn("PAYPALISHIRING".length(), 3);
        Assert.assertEquals(7, col);
    }

    @Test
    public void testZigZagColumn_PAYPALISHIRING_2() {
        int col = new ZigZag().calculateColumn("PAYPALISHIRING".length(), 2);
        Assert.assertEquals(7, col);
    }

    @Test
    public void testZigZagColumn_PAYPALISHIRING_1() {
        int col = new ZigZag().calculateColumn("PAYPALISHIRING".length(), 1);
        Assert.assertEquals(14, col);
    }

    @Test
    public void testZigZagColumn_PAYPALISHIRING_4() {
        int col = new ZigZag().calculateColumn("PAYPALISHIRING".length(), 4);
        Assert.assertEquals(7, col);
    }

    @Test
    public void testZigZagColumn_MYNAMEISRICHARDWEI_4() {
        int col = new ZigZag().calculateColumn("MYNAMEISRICHARDWEI".length(), 4);
        Assert.assertEquals(9, col);
    }
}
