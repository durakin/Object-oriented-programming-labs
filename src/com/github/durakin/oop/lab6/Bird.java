package com.github.durakin.oop.lab6;

public abstract class Bird implements WishingZoo {
    private final String NAME;

    public Bird(String NAME) {
        this.NAME = NAME;
    }

    public abstract void motion();

    public String getNAME() {
        return NAME;
    }

    public String toString() {
        return NAME;
    }
}
