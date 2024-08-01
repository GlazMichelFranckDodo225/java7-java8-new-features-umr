package com.dgmf.java7.f.objectsclassnullchecks;

public class RequireNonNull {
    public static void main(String[] args) {
        Person person = null;
        ProcessPersonDetails processPersonDetails = new ProcessPersonDetails();
        processPersonDetails.processPersonDetails(person);
    }
}
