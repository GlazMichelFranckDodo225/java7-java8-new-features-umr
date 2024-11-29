package com.dgmf.java8.a.defaultmethodsininterfaces;

public interface Vehicle {

    int getSpeed();

    void applyBreak();

    default void autoPilot() {
        System.out.println("I will help in driving with out manual support");
    }
}
