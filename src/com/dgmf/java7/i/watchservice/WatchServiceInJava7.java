package com.dgmf.java7.i.watchservice;

import java.nio.file.*;

public class WatchServiceInJava7 {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        directoryWatchService();
    }

    /**
     * Sample implementation from Java 7
     *
     * @throws Exception
     *
     */
    public static void directoryWatchService() throws Exception {
        WatchService watchService = FileSystems.getDefault().newWatchService();
        Path path = Paths.get("C:\\WatchService");
        path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY,
                StandardWatchEventKinds.ENTRY_DELETE);
        boolean poll = true;
        WatchKey key = watchService.take();
        while (poll) {
            for (WatchEvent<?> event : key.pollEvents()) {
                System.out.println("Event kind : " + event.kind() + " - for the file : " + event.context());
            }
            poll = key.reset();
        }

    }

}