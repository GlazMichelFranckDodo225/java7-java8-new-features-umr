package com.dgmf.java7.d.rethrowingexceptions;

// import static com.dgmf.java7.d.rethrowingexceptions.RethrowExceptionsBeforeJava7.beforeJava7;
import static com.dgmf.java7.d.rethrowingexceptions.RethrowExceptionsWithJava7.withJava7;

@SuppressWarnings("serial")
public class Main {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // beforeJava7("First");
        withJava7("First");
    }
}
