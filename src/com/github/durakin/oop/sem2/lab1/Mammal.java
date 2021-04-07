package com.github.durakin.oop.sem2.lab1;

public abstract class Mammal extends Animal {
    private final double PREGNANCY_DURATION;

    public Mammal(String NAME, String redListStatus, double pregnancyDuration) {
        super(NAME, redListStatus);
        this.PREGNANCY_DURATION = pregnancyDuration;
    }

    public double getPREGNANCY_DURATION() {
        return PREGNANCY_DURATION;
    }
}
