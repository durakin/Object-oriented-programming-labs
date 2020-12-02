package com.github.durakin.oop.lab6;

public abstract class Aviary {
    private final int number;
    private Exotic exoticBeing;

    public Aviary(int number) {
        this.number = number;
    }

    public void AssignAnimal(WishingZoo newBeing) {
        if (exoticBeing != null) {
            throw new RuntimeException("Aviary is not empty!");
        }
        exoticBeing = (Exotic) newBeing;
    }

    public Exotic ClearAviary() {
        var box = exoticBeing;
        exoticBeing = null;
        return box;
    }

    public Exotic getExoticBeing() {
        return exoticBeing;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Aviary № " + number +
                "\nType: " + (this instanceof HeatLoving ? "Warm" : "Cold") +
                "\nContains: " + (this.exoticBeing == null ? "Empty" : exoticBeing.toString());
    }
}
