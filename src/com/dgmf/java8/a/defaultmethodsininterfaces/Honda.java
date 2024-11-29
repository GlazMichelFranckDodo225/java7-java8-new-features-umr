package com.dgmf.java8.a.defaultmethodsininterfaces;

public class Honda implements Vehicle {

    @Override
    public int getSpeed() {
        return 100;
    }

    @Override
    public void applyBreak() {
        System.out.println("Breaks applied");
    }

    @Override
    public void autoPilot() {
        System.out.println("Honda Auto pilot applied");
    }

    static void sayHello() {
        System.out.println(
                "Hi, This is your favourite honda car (Static Method inside Honda Class)"
        );
    }
}
