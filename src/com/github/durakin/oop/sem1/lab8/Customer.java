package com.github.durakin.oop.sem1.lab8;

import java.io.Serializable;

public class Customer implements Serializable {
    private final transient String NAME;
    private final int AGE;
    private final int BILL;

    public Customer(String NAME, int AGE, int BILL) {
        this.NAME = NAME;
        this.AGE = AGE;
        this.BILL = BILL;
    }

    public String getNAME() {
        return NAME;
    }

    public int getAGE() {
        return AGE;
    }

    public int getBILL() {
        return BILL;
    }

    @Override
    public String toString() {
        return "Customer " +
                NAME +
                "; Age: " + AGE +
                "; Bill: " + BILL;
    }
}
