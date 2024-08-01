package com.dgmf.java7.f.objectsclassnullchecks;

import java.util.Objects;

public class ProcessPersonDetails {
    // private static void processPersonDetails(Person person) {
    public void processPersonDetails(Person person) {
        Objects.requireNonNull(person, "Person object can't be null");
        // In Case of NullPointerException Above, these Lines of Codes will not
        // Be Executed
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
    }
}
