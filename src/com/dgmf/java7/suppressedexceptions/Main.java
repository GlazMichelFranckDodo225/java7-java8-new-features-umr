package com.dgmf.java7.suppressedexceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

import static com.dgmf.java7.suppressedexceptions.SupressedExceptionsBeforeJava7.beforeJava7;
import static com.dgmf.java7.suppressedexceptions.SupressedExceptionsWithJava7.withJava7;

public class Main {
    private final static Logger LOGGER =
            Logger.getLogger(Main.class.getName());

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) {
        try {
            beforeJava7();
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage());
        }

        try {
            withJava7();
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage());
            final Throwable[] suppressedExceptions = ex.getSuppressed();
            final int numSuppressed = suppressedExceptions.length;
            if (numSuppressed > 0) {
                for (final Throwable exception : suppressedExceptions) {
                    LOGGER.log(Level.SEVERE, exception.getMessage());
                }
            }
        }
    }
}
