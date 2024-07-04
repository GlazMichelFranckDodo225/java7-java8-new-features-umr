package com.dgmf.java7.trywithresources;

import java.io.*;

public class TryCatchWithJava7 {
    /**
     * Sample implementation from Java 7
     */
    public static void withJava7() throws IOException {
        File file = new File("src/com/dgmf/hello.txt");

        // Note that Whatever Resource Declared Inside Brackets, this
        // Resource is Final
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        }
    }
}
