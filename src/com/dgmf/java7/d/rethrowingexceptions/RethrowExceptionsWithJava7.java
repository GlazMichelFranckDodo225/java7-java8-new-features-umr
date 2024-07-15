package com.dgmf.java7.d.rethrowingexceptions;

public class RethrowExceptionsWithJava7 {
    /**
     * Sample implementation from Java 7
     *
     * @throws FirstException,SecondException
     *
     */
    public static void withJava7(String exceptionName)
            throws FirstException, SecondException {
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
