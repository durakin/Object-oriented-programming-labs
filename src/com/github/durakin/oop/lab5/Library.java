package com.github.durakin.oop.lab5;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<LibraryVisitor> VISITORS;
    private final List<LedgerEntry> LEDGER;

    public Library() {
        VISITORS = new ArrayList<>();
        LEDGER = new ArrayList<>();
    }

    public LedgerEntry findLedger(Book book) {
        for (LedgerEntry ledgerEntry : LEDGER) {
            if (ledgerEntry.getBOOK() == book) {
                return ledgerEntry;
            }
        }
        return null;
    }

    public void addVisitor(LibraryVisitor visitor){
        if(!VISITORS.contains(visitor)){
            VISITORS.add(visitor);
        }
    }

    public void addBook(Book book) {
        LedgerEntry ledger = findLedger(book);
        if (ledger != null) {
            ledger.getNUMBER().addAndGet(1);
        }
        else {
            LEDGER.add(new LedgerEntry(book));
        }
    }



    private boolean takeBook(Book )



}

