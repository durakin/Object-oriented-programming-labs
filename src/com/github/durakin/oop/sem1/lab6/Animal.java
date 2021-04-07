package com.github.durakin.oop.sem1.lab6;

public abstract class Animal implements WishingZoo {
    private final String NAME;

    public Animal(String NAME) {
        this.NAME = NAME;
    }

    public abstract void say();

    public String getNAME() {
        return NAME;
    }

    @Override
    public String toString() {
        return NAME;
    }
}
