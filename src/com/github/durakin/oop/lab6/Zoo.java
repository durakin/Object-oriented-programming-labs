package com.github.durakin.oop.lab6;

import java.util.*;

public class Zoo {
    private final Queue<WishingZoo> toDistribute;
    private final Set<WishingZoo> rejected;
    private final Set<Aviary> aviaries;

    public Zoo() {
        toDistribute = new LinkedList<>();
        rejected = new HashSet<>();
        aviaries = new HashSet<>();
    }

    public void AddToQueue(WishingZoo being) {
        if (findAviaryByBeing(being) != null) {
            throw new RuntimeException("Being is already in the zoo");
        }
        toDistribute.remove(being);
        toDistribute.add(being);
    }

    private Aviary emptyHeatAviary() {
        for (Aviary aviary : aviaries) {
            if (aviary.getExoticBeing() == null && aviary instanceof HeatLoving) {
                return aviary;
            }
        }
        return (new HeatAviary(aviaries.size() + 1));
    }

    private Aviary emptyColdAviary() {
        for (Aviary aviary : aviaries) {
            if (aviary.getExoticBeing() == null && aviary instanceof ColdLoving) {
                return aviary;
            }
        }
        return (new ColdAviary(aviaries.size() + 1));
    }

    private Aviary findAviaryByBeing(WishingZoo being) {
        for (Aviary aviary : aviaries) {
            if (aviary.getExoticBeing() == being) {
                return aviary;
            }
        }
        return null;
    }

    public void Distribution() {
        while (!toDistribute.isEmpty()) {
            var distributing = toDistribute.poll();
            if (!(distributing instanceof Exotic)) {
                rejected.add(distributing);
                continue;
            }
            Aviary aviary;
            if (distributing instanceof HeatLoving) {
                aviary = emptyHeatAviary();
            } else {
                aviary = emptyColdAviary();
            }
            aviaries.add(aviary);
            aviary.AssignAnimal(distributing);
            rejected.remove(distributing);
        }
    }

    public void Display() {
        var sb = new StringBuilder();
        var coldAv = 0;
        var heatAv = 0;
        for (Aviary aviary : aviaries) {
            sb.append(aviary);
            sb.append("\n");
            if (aviary instanceof HeatLoving) {
                heatAv++;
            } else {
                coldAv++;
            }
        }
        System.out.println("В зоопарке создано " + heatAv + " теплых вальеров и " + coldAv + " холодных. ");
        System.out.println(sb);
        System.out.println("Отклоненные животные: ");
        for (WishingZoo rejectedBeing : rejected) {
            System.out.println(rejectedBeing + "\n");
        }
    }

    public Set<WishingZoo> getRejected() {
        return rejected;
    }

    public List<Exotic> zooBeings() {
        var result = new LinkedList<Exotic>();
        for (var aviary : aviaries) {
            result.add(aviary.getExoticBeing());
        }
        return result;
    }
}
