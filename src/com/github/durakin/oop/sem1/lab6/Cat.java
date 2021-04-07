package com.github.durakin.oop.sem1.lab6;

public class Cat extends Animal {

    public Cat(String NAME) {
        super(NAME);
    }

    @Override
    public void say() {
        System.out.println("Мяу");
    }

    @Override
    public String toString() {
        return "Cat " + super.toString();
    }
}
