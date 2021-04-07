package com.github.durakin.oop.sem1.lab6;

public class Penguin extends Bird implements Exotic, ColdLoving {
    public Penguin(String NAME) {
        super(NAME);
    }

    @Override
    public void motion() {
        System.out.println("Я плаваю");
    }

    @Override
    public String toString() {
        return "Penguin " + super.toString();
    }
}
