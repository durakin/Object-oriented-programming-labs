package com.github.durakin.oop.sem1.lab7;

public class MedicalCenter extends OlympicConstruction {
    public MedicalCenter(String TITLE) {
        super(TITLE);
    }

    @Override
    public void check() {
        System.out.println("Checked medical center " + this.getTITLE());
    }

    public String toString() {
        return "Medical center № " + this.getNUMBER();
    }
}
