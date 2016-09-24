package com.zzp.java7.io.instance;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.*;

/**
 * Desc
 * Created by zzp
 * on 2016/8/22.23:10
 */
public class WatchServicceTest {

    @Test
    public void watchTest() {
        try {
            WatchService watcher = FileSystems.getDefault().newWatchService();
            Path dir = Paths.get("D:\\tools\\down\\log");
            WatchKey key = dir.register(watcher, StandardWatchEventKinds.ENTRY_MODIFY);
            while (key.isValid()) {
                key = watcher.take();
                for (WatchEvent<?> event : key.pollEvents()) {
                    if (event.kind() == StandardWatchEventKinds.ENTRY_MODIFY) {
                        System.out.println("dir is changed!");
                    }
                }
                key.reset();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
