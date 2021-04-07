package com.github.durakin.oop.sem1.lab7;

public class Library extends SimpleConstruction {
    public Library(String TITLE) {
        super(TITLE);
    }

    @Override
    public void repair() {
        System.out.println("Аккуратней с книгами!");
    }


    public String toString() {
        return "Library № " + this.getNUMBER();
    }
}
