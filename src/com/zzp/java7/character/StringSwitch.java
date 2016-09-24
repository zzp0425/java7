package com.zzp.java7.character;

import org.junit.Test;

/**
 * Desc
 * Created by zzp
 * on 2016/8/19.20:06
 */
public class StringSwitch {

    @Test
    public void stringSwitch() {
        String meidum = "02011";

        switch (meidum) {
            case "0201" :
                System.out.println("柜面");
                break;
            case "0314" :
                System.out.println("ATM");
                break;
            default:
                System.out.println("银联");
                break;
        }
    }
}
