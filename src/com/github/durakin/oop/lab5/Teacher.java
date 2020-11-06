package com.github.durakin.oop.lab5;

public class Teacher extends LibraryVisitor {
    @Override
    public void printBooks() {
        System.out.println("Я взял так много для студентов");
    }

    public Teacher(String LASTNAME) {
        super(LASTNAME);
    }
}
