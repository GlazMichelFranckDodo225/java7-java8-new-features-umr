package com.dgmf.java8.a.defaultmethodsininterfaces;

public class VehicleDriverClass {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Honda honda = new Honda();
        System.out.println(honda.getSpeed());
        honda.applyBreak();
        honda.autoPilot();
    }
}
