package com.dgmf.java8.a.defaultmethodsininterfaces;

public interface Vehicle {

    int getSpeed();

    void applyBreak();

    default void autoPilot() {
        System.out.println("I will help in driving with out manual support");
    }

    static void sayHello() {
        System.out.println(
                "Hi, This is your favourite car (Static Method inside Vehicle Interface)"
        );
    }
}
