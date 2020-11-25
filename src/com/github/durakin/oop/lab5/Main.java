package com.github.durakin.oop.lab5;

public class Main {
    public static void main(String[] args) {
        var library = new Library();
        var visitor1 = new Student("Price");
        var visitor2 = new Teacher("Jefferson");
        var visitor3 = new Student("Graham");
        library.addVisitor(visitor1);
        library.addVisitor(visitor2);
        library.addVisitor(visitor3);
        var book1 = new Book("E. Limonov", "The Great Mother of Love");
        var book2 = new Book("M. Puzo", "The Godfather");
        library.addBook(book1);
        library.addBook(book2);
        library.takeBook(visitor1, book1);
        library.takeBook(visitor1, book2);
        library.takeBook(visitor2, book1);
        library.takeBook(visitor3, book1);
        library.takeBook(visitor3, book2);
        library.findReaderByTitleBook("The Great Mother of Love");
        library.findReaderByTitleBook("The Godfather");
        System.out.println("Max reader");
        System.out.println(library.findMaxReader());
        System.out.println("First visitor's printBooks()");
        visitor1.printBooks();
        System.out.println("Second visitor's printBooks()");
        visitor2.printBooks();
        System.out.println("Third visitor's printBooks()");
        visitor3.printBooks();


    }
}