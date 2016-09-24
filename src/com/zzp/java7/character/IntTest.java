package com.zzp.java7.character;

import org.junit.Test;

/**
 * Desc
 * Created by zzp
 * on 2016/8/19.20:01
 */
public class IntTest {

    @Test
    public void testUnderLine() {
        int underLine = 10_000_000;
        long underLong = 2_234_345_987L;
        System.out.println(underLine);
        System.out.println(underLong);
        underLine = 0b01101111;
        System.out.println(underLine);
    }
}
