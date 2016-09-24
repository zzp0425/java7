package com.zzp.java7.io.instance;

import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * Desc
 * Created by zzp
 * on 2016/8/22.21:56
 */
public class ReadWrite {

    private static final String PATH = "D:\\tools\\down\\log";

    @Test
    public void readAllLine() throws IOException {
        Path path = Paths.get(PATH, "0319.txt");
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

        lines.forEach(s -> System.out.println(s));

        Files.newBufferedReader(path, StandardCharsets.UTF_8);
        Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.WRITE);
        byte[] bytes = Files.readAllBytes(path);
    }


}
