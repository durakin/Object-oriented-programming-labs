package com.github.durakin.oop.sem2.lab1;

public class Bird extends Animal {

    private final Boolean MIGRATION;

    public Bird(String NAME, String redListStatus, Boolean MIGRATION) {
        super(NAME, redListStatus);
        this.MIGRATION = MIGRATION;
        AddExtendingObject(this);
    }

    @Override
    public String getInfo() {
        return "Bird " + getNAME() + ". Red list status: " + getRedListStatus() + (MIGRATION ? ". Bird migrates." : "Bird doesn't migrate.");
    }

    @Override
    public String getInfo(String separator, String endOfOutput) {
        return "Bird " + getNAME() + separator + "Red list status: " + getRedListStatus() + separator + (MIGRATION ? "Bird migrates." : "Bird doesn't migrate." + endOfOutput);
    }
}
