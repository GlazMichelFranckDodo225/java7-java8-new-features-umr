package com.dgmf.java7.c.catchingmultipleexceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CatchingMultipleExceptionsBeforeJava7 {
    private final static Logger LOGGER =
            Logger.getLogger(CatchingMultipleExceptionsBeforeJava7.class.getName());
    /**
     * Sample implementation before Java 7
     *
     */
    public static void beforeJava7() {
        int arr[] = { 1, 2, 3 };
        try {
            for (int i = 0; i < arr.length + 1; i++) {
                System.out.println(arr[i]);
            }
        } catch (NullPointerException nex) {
            LOGGER.log(Level.SEVERE, nex.toString());
        } catch (ArrayIndexOutOfBoundsException aioex) {
            LOGGER.log(Level.SEVERE, aioex.toString());
        }
    }
}
