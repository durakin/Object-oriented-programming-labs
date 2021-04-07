package com.github.durakin.oop.sem2.lab1;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    private static final List<Animal> EXTENDING_OBJECTS = new ArrayList<>();
    private final String NAME;
    private String redListStatus;

    public Animal(String NAME, String redListStatus) {
        this.NAME = NAME;
        this.redListStatus = redListStatus;
    }

    public static String ExtendingObjectsToString() {
        StringBuilder result;
        result = new StringBuilder();
        for (Animal i : EXTENDING_OBJECTS) {
            result.append(i.getInfo("\n", "\n\n"));
        }
        return result.toString();
    }

    public String getNAME() {
        return NAME;
    }

    public String getRedListStatus() {
        return redListStatus;
    }

    public void setRedListStatus(String redListStatus) {
        this.redListStatus = redListStatus;
    }

    public void AddExtendingObject(Animal objectToAdd) {
        EXTENDING_OBJECTS.add(objectToAdd);
    }

    public abstract String getInfo();

    public abstract String getInfo(String separator, String endOfOutput);
}
