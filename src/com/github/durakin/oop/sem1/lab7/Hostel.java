package com.github.durakin.oop.sem1.lab7;

import java.util.concurrent.ThreadLocalRandom;

public class Hostel extends SimpleConstruction implements RentObject {
    public Hostel(String TITLE) {
        super(TITLE);
    }

    @Override
    public int rent() {
        return ThreadLocalRandom.current().nextInt(0, UniversityConstruction.getMAXCOST());
    }

    @Override
    public void repair() {
        System.out.println("Нам помогут студенты-строители на практике!");
    }


    public String toString() {
        return "Hostel № " + this.getNUMBER();
    }
}
