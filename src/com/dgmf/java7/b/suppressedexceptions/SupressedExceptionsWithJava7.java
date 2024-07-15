package com.dgmf.java7.b.suppressedexceptions;

import com.dgmf.utils.CustomDirtyResource;

public class SupressedExceptionsWithJava7 {
    /**
     * Sample implementation from Java 7
     * @throws Exception
     */
    public static void withJava7() throws Exception {
        try (CustomDirtyResource cr = new CustomDirtyResource()) {
            cr.readFromResource();
        }
    }
}
