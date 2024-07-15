package com.dgmf.java7.c.catchingmultipleexceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CatchingMultipleExceptionsWithJava7 {
    private final static Logger LOGGER =
        Logger.getLogger(CatchingMultipleExceptionsWithJava7.class.getName());
    /**
     * Sample implementation from Java 7
     *
     */
    public static void withJava7() {
        int arr[] = { 1, 2, 3 };
        try {
            for (int i = 0; i < arr.length + 1; i++) {
                System.out.println(arr[i]);
            }
        } catch (
                NullPointerException |
                ArrayIndexOutOfBoundsException |
                ClassCastException ex
        ) {
            LOGGER.log(Level.SEVERE, ex.toString());
        }
    }
}
