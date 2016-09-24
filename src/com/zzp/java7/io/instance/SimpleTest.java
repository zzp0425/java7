package com.zzp.java7.io.instance;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.*;

/**
 * Desc
 * Created by zzp
 * on 2016/8/21.11:29
 */
public class SimpleTest {


    private static final String pathStr = "D:\\tools\\360\\rar\\360zip";

    @Test
    public void createPath() {
        Path path = Paths.get(pathStr);

        System.out.println(path);
        path = FileSystems.getDefault().getPath(pathStr);
        System.out.println(path);
    }

    @Test
    public void getInfoFromPath() {
        Path path = Paths.get(pathStr);//创建绝对路径

        System.out.println("file name : " + path.getFileName());//获取文件名

        //获取名称元素数量 tools、360、rar、360zip
        System.out.println(path.getNameCount());
        //获取父节点
        System.out.println(path.getParent());
        //获取根节点
        System.out.println(path.getRoot());
        //
        System.out.println(path.subpath(0, 1));
        //获取文件系统
        System.out.println(path.getFileSystem());
    }

    @Test
    public void removeRedundancy() {
        Path path = Paths.get(".\\SimpleTest.java");

        System.out.println(path);
        System.out.println(path.normalize());//去掉冗余的 .\

        path = Paths.get("D:\\tools\\lnk\\dict.lnk").normalize();
        System.out.println(path);
    }


    @Test
    public void findProperties() {
        Path path = Paths.get(pathStr);

        try(DirectoryStream<Path> stream = Files.newDirectoryStream(path, "*.dll")) {
            for (Path entry : stream) {
                System.out.println(entry.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
