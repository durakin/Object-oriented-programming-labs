package com.github.durakin.oop.lab6;

public class Lion extends Animal implements Exotic, HeatLoving {
    public Lion(String NAME) {
        super(NAME);
    }

    @Override
    public void say() {
        System.out.println("Рррр");
    }

    @Override
    public String toString() {
        return "Lion " + super.toString();
    }
}
