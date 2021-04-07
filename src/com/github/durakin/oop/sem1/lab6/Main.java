package com.github.durakin.oop.sem1.lab6;

public class Main {
    public static void main(String[] args) {
        var zoo = new Zoo();
        var penguin = new Penguin("('')>");
        var dove = new Dove("( •)>");
        var cat = new Cat("=^.^=");
        var lion = new Lion("⊃(￣(ｴ)￣)⊂");
        zoo.AddToQueue(penguin);
        zoo.AddToQueue(dove);
        zoo.AddToQueue(cat);
        zoo.AddToQueue(lion);
        zoo.Display();
        zoo.Distribution();
        zoo.Display();
        for (var being : zoo.getRejected()) {
            if (being instanceof Animal) {
                System.out.print(being + " says: ");
                ((Animal) being).say();
            } else {
                System.out.print(being + " says: ");
                ((Bird) being).motion();
            }
        }
        for (var being : zoo.zooBeings()) {
            if (being instanceof Animal) {
                System.out.print(being + " says: ");
                ((Animal) being).say();
            } else {
                System.out.print(being + " says: ");
                ((Bird) being).motion();
            }
        }
    }
}