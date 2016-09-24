package com.zzp.java7.character;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * Desc
 * Created by zzp
 * on 2016/8/19.20:23
 */
public class TryWithResource {

    @Test
    public void twr() {

        try(
                OutputStream out = new FileOutputStream("");
                InputStream in = new URL("", "", "").openStream();
                ) {
            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) >  0) {
                out.write(buf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void suppressedException() {
        try (InputStream in = null) {
            in.available();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
