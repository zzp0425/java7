package com.zzp.java7.character;

import org.junit.Test;

import javax.security.auth.login.Configuration;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Desc
 * Created by zzp
 * on 2016/8/19.20:13
 */
public class ExceptionTest {
    @Test
    public void exceptionTest() {
        String fileName = "D://logs//txt.txt";
        File file = null;
        Configuration cfg;
        try {
            FileInputStream fis = new FileInputStream(file);
            fis.available();
            fis.close();
        } catch (FileNotFoundException | NullPointerException e) {//多个Exception
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void finalExceptionTest() {
        try {
            File file = null;
            FileInputStream fis = new FileInputStream(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
