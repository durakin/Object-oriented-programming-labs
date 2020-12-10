package com.github.durakin.oop.lab7;

import java.util.concurrent.ThreadLocalRandom;

public class ConcertHall extends OlympicConstruction implements RentObject {
    public ConcertHall(String TITLE) {
        super(TITLE);
    }


    public int rent() {
        return ThreadLocalRandom.current().nextInt(0, UniversityConstruction.getMAXCOST());
    }

    @Override
    public void check() {
        System.out.println("Checked concert hall № " + this.getNUMBER());
    }

    @Override
    public String toString() {
        return "ConcertHall № " + this.getNUMBER();
    }
}
