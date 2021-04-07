package com.github.durakin.oop.sem2.lab1;

import java.util.ArrayList;
import java.util.List;

public class NationalPark {
    private final String NAME;
    private final List<Animal> seenAnimals;

    public NationalPark(String NAME) {
        this.NAME = NAME;
        this.seenAnimals = new ArrayList<>();
    }

    public void AddAnimal(Animal animalToAdd) {
        seenAnimals.add(animalToAdd);
    }

    public void RemoveAnimal(Animal animalToRemove) {
        seenAnimals.remove(animalToRemove);
    }

    @Override
    public String toString() {
        StringBuilder result;
        result = new StringBuilder("National park " + NAME + "\n\nSeen animals: \n");
        for (Animal i : seenAnimals) {
            result.append(i.getInfo("\n", "\n\n"));
        }
        return result.toString();
    }
}
