package com.dgmf.java7.c.catchingmultipleexceptions;

import static com.dgmf.java7.c.catchingmultipleexceptions.CatchingMultipleExceptionsWithJava7.withJava7;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        CatchingMultipleExceptionsBeforeJava7.beforeJava7();
        withJava7();
    }
}
