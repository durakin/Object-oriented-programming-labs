package com.github.durakin.oop.sem1.lab5;


public class Student extends LibraryVisitor {
    public Student(String LASTNAME) {
        super(LASTNAME);
    }

    @Override
    public void printBooks() {
        for (Book book : getBOOKS()) {
            System.out.println(book);
        }
    }
}
