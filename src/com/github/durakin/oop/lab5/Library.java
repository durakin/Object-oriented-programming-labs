package com.github.durakin.oop.lab5;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<LibraryVisitor> VISITORS;
    private final List<Book> BOOKS;

    public Library() {
        VISITORS = new ArrayList<>();
        BOOKS = new ArrayList<>();
    }


    public void addVisitor(LibraryVisitor visitor) throws RuntimeException {
        if (!VISITORS.contains(visitor)) {
            VISITORS.add(visitor);
        } else throw new RuntimeException("Visitor already has a card");
    }

    public void addBook(Book book) throws RuntimeException {
        if (this.findBookByName(book.getNAME()) != null){
            throw new RuntimeException("Library already owns this book");
        }
        BOOKS.add(book);
    }

    public void takeBook(LibraryVisitor visitor, Book book)throws RuntimeException {
        if (!BOOKS.contains(book)) {
            throw new RuntimeException("There is no suсh book in library");
        }
        if (visitor.getBOOKS().contains(book)) {
            throw new RuntimeException("Visitor already has this book");
        }
        visitor.getBOOKS().add(book);
    }

    public void findReaderByTitleBook(String bookName) {
        System.out.println("Readers of the book " + bookName + ":");
        Book book = findBookByName(bookName);
        for (LibraryVisitor i : VISITORS) {
            if (i.getBOOKS().contains(book)) {
                System.out.println(i.getLASTNAME());
            }
        }
    }

    public LibraryVisitor findVisitorByLastname(String lastname) {
        for (LibraryVisitor i : VISITORS) {
            if (i.getLASTNAME().equals(lastname)) {
                return i;
            }
        }
        return null;
    }

    private Book findBookByName(String name) {
        for (Book i : BOOKS) {
            if (i.getNAME().equals(name)) {
                return i;
            }
        }
        return null;
    }

    public String findMaxReader() {
        List<LibraryVisitor> resultList = new ArrayList();
        int maxBooks = 0;
        for (LibraryVisitor i : VISITORS) {
            if (i.getBOOKS().size() == maxBooks) {
                resultList.add(i);
            }

            if (i.getBOOKS().size() > maxBooks) {
                maxBooks = i.getBOOKS().size();
                resultList.clear();
                resultList.add(i);
            }
        }
        StringBuilder result = new StringBuilder();
        for (LibraryVisitor i : resultList) {
            result.append(i.getLASTNAME()).append("\n");
        }
        return result.toString();
    }
}

