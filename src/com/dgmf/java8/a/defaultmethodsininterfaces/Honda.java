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
}
