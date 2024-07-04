package com.dgmf.java7.trywithresources;

import com.dgmf.utils.CustomResource;

public class TryCatchWithCustomResInJava7  {
    /**
     * Sample implementation from Java 7
     */
    public static void withCustomResInJava7() throws Exception {
        try(CustomResource cr = new CustomResource()) {
            cr.readFromResource();
        }
    }
}
