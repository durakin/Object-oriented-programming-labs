package com.github.durakin.oop.sem2.lab1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        NationalPark park = new NationalPark("Stolby");
        park.AddAnimal(new Bird("Sinichka", "LC", false));
        park.AddAnimal(new EvenToed("Kozel", "LC", 21.4, 10));
        Animal b = new EvenToed("Begemot", "VU", 34.7, 25);
        System.out.println(b.getInfo());
        System.out.println(park.toString());
        System.out.println(Animal.ExtendingObjectsToString());
    }
}
