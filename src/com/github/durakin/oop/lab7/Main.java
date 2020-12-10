package com.github.durakin.oop.lab7;

public class Main {
    public static void main(String[] args) {
        var university = new University("MIT");
        var rentalDepartment = new RentalDepartment<UniversityConstruction>();
        var stadium = new OlympicStadium("stadium");
        var hostel = new Hostel("hostel");
        var concert = new ConcertHall("concert");
        var library = new Library("lib");
        university.addObject(concert);
        university.addObject(stadium);
        university.addObject(hostel);
        System.out.println(stadium);
        System.out.println(hostel);
        System.out.println(concert);
        rentalDepartment.add(stadium);
        rentalDepartment.add(hostel);
        rentalDepartment.add(concert);
        System.out.println(rentalDepartment);
        var x = rentalDepartment.findFreeByCost(2000);
        rentalDepartment.rent(x);
        System.out.println("Taken for rent " + x);
        System.out.println(rentalDepartment);
        rentalDepartment.unRent(x);
        System.out.println("Given back " + x);
        System.out.println(rentalDepartment);
        var y = rentalDepartment.findFreeByCost(400);
        if (rentalDepartment.rent(y)) {
            System.out.println("Taken for rent " + y);
            System.out.println(rentalDepartment);
        } else System.out.println("No such object");

        ((OlympicConstruction) stadium).check();
        ((SimpleConstruction) hostel).repair();
        ((SimpleConstruction) library).repair();
    }

}
