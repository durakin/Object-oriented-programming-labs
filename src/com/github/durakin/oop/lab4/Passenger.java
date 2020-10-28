package com.github.durakin.oop.lab4;

public class Passenger {

    private final String NAME;
    private final String PASSPORT;

    public Passenger(String name, String passport) {
        NAME = name;
        PASSPORT = passport;
    }

    public String getNAME() {
        return NAME;
    }

    @Override
    public String toString() {
        return "Passenger " +
                NAME + '\n' +
                "Passport: " + PASSPORT;
    }
}
