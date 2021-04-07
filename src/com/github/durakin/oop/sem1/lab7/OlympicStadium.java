package com.github.durakin.oop.sem1.lab7;

import java.util.concurrent.ThreadLocalRandom;

public class OlympicStadium extends OlympicConstruction implements RentObject {
    public OlympicStadium(String TITLE) {
        super(TITLE);
    }

    public int rent() {
        return ThreadLocalRandom.current().nextInt(0, UniversityConstruction.getMAXCOST());
    }

    @Override
    public void check() {
        System.out.println("Checked stadium " + this.getTITLE() + " № " + this.getNUMBER());
    }

    public String toString() {
        return "Stadium № " + this.getNUMBER();
    }
}
