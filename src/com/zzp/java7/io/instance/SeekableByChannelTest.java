package com.zzp.java7.io.instance;

import org.junit.Test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Desc
 * Created by zzp
 * on 2016/8/23.15:00
 */
public class SeekableByChannelTest {

    public static final String DIR = "D:\\tools\\down\\log\\";


    /**
     * 利用FileChannel的寻址能力读取文件的最后1000个字节
     * @throws IOException
     */
    @Test
    public void readBySite() throws IOException {
        Path logFile = Paths.get(DIR, "0319.txt");
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        FileChannel channel = FileChannel.open(logFile, StandardOpenOption.READ);
        int i = channel.read(buffer, channel.size() - 100);

        BufferedWriter br = Files.newBufferedWriter(Paths.get(DIR, "test.txt"), StandardCharsets.UTF_8);
        System.out.println(i);
    }
}
