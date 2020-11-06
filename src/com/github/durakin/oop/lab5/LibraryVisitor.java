package com.github.durakin.oop.lab5;

import java.util.ArrayList;
import java.util.List;

public abstract class LibraryVisitor {
    private final String LASTNAME;
    private final List<Book> BOOKS;

    public abstract void printBooks();

    public LibraryVisitor(String LASTNAME) {
        this.LASTNAME = LASTNAME;
        this.BOOKS = new ArrayList<>();
    }

    public void addBook(Book book){
        BOOKS.add(book);
    }

    public String getLASTNAME() {
        return LASTNAME;
    }

    public List<Book> getBOOKS() {
        return BOOKS;
    }
}
