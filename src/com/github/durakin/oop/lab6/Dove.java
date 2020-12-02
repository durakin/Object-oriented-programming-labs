package com.github.durakin.oop.lab6;

public class Dove extends Bird {
    public Dove(String NAME) {
        super(NAME);
    }

    @Override
    public void motion() {
        System.out.println("Я летаю");
    }

    @Override
    public String toString() {
        return "Dove " + super.toString();
    }
}
