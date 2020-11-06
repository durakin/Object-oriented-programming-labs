package com.github.durakin.oop.lab5;

import java.util.concurrent.atomic.AtomicInteger;

public class LedgerEntry {
    private final Book BOOK;
    private final AtomicInteger NUMBER;
    private final AtomicInteger TAKEN;

    public LedgerEntry(Book BOOK) {
        this.BOOK = BOOK;
        this.NUMBER = new AtomicInteger(1);
        this.TAKEN = new AtomicInteger();
    }

    public Book getBOOK() {
        return BOOK;
    }

    public AtomicInteger getNUMBER() {
        return NUMBER;
    }

    public AtomicInteger getTAKEN() {
        return TAKEN;
    }
}