package com.dgmf.java7.suppressedexceptions;

import com.dgmf.utils.CustomDirtyResource;

public class SupressedExceptionsBeforeJava7 {
    /**
     * Sample implementation before Java 7
     *
     * @throws Exception
     */
    public static void beforeJava7() throws Exception {
        CustomDirtyResource cr = null;
        try {
            cr = new CustomDirtyResource();
            cr.readFromResource();
        } finally {
            cr.close();
        }
    }
}
