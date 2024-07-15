package com.dgmf.java7.d.rethrowingexceptions;

public class RethrowExceptionsBeforeJava7 {
    /**
     * Sample implementation before Java 7
     *
     * @throws Exception
     *
     */
    public static void beforeJava7(String exceptionName) throws Exception {
        try {
            if (exceptionName.equals("First")) {
                throw new FirstException();
            } else {
                throw new SecondException();
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
