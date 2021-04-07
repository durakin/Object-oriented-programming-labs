package com.github.durakin.oop.sem2.lab1;

public class EvenToed extends Mammal {
    private final double MEAN_GROUP_NUMBER;

    public EvenToed(String NAME, String redListStatus, double pregnancyDuration, double MEAN_GROUP_NUMBER) {
        super(NAME, redListStatus, pregnancyDuration);
        this.MEAN_GROUP_NUMBER = MEAN_GROUP_NUMBER;
        AddExtendingObject(this);
    }

    public double getMEAN_GROUP_NUMBER() {
        return MEAN_GROUP_NUMBER;
    }

    @Override
    public String getInfo() {
        return "Even toed mammal animal " + getNAME() + ". Red list status: " + getRedListStatus() + ". Usual pregnancy duration: " + getPREGNANCY_DURATION() + " weeks. Mean group number: " + getMEAN_GROUP_NUMBER() + ".";
    }

    @Override
    public String getInfo(String separator, String endOfOutput) {
        return "Even toed mammal animal " + getNAME() + ". Red list status: " + getRedListStatus() + separator + "Usual pregnancy duration: " + getPREGNANCY_DURATION() + " weeks" + separator + "Mean group number: " + getMEAN_GROUP_NUMBER() + endOfOutput;

    }
}
