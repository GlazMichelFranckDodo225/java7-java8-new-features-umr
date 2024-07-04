package com.dgmf.java7.trywithresources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchBeforeJava7 {
    /**
     * Sample Implementation Before Java 7
     */
    public static void beforeJava7() throws IOException {
        File file = new File("src/com/dgmf/hello.txt");
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(file));
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        } finally {
            br.close();
        }
    }
}
