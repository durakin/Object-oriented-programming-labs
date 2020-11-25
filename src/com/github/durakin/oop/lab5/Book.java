package com.github.durakin.oop.lab5;

public class Book {
    private final String AUTHOR;
    private final String NAME;

    public Book(String AUTHOR, String NAME) {
        this.AUTHOR = AUTHOR;
        this.NAME = NAME;
    }

    public String getAUTHOR() {
        return AUTHOR;
    }

    public String getNAME() {
        return NAME;
    }

    @Override
    public String toString() {
        return "Book by " + AUTHOR + ", \"" + NAME + '"';
    }
}
