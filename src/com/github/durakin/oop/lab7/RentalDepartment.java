package com.github.durakin.oop.lab7;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class RentalDepartment<T> {
    private final List<T> freeObjects;
    private final List<T> leasedObjects;
    private final Dictionary<T, Integer> rentPrices;

    public RentalDepartment() {
        this.freeObjects = new ArrayList<>();
        this.leasedObjects = new ArrayList<>();
        this.rentPrices = new Hashtable<>();
    }

    public void add(T t) {
        if (!freeObjects.contains(t) && !leasedObjects.contains(t)) {
            freeObjects.add(t);
        }
        rentPrices.put(t, ((RentObject)t).rent());

    }

    public void remove(T t) {
        freeObjects.remove(t);
        leasedObjects.remove(t);
    }

    public boolean rent(T t) {
        if (freeObjects.remove(t)) {
            leasedObjects.add(t);
            return true;
        } else return false;
    }

    public boolean unRent(T t) {
        if (leasedObjects.remove(t)) {
            freeObjects.add(t);
            return true;
        } else return false;
    }

    public T findFreeByCost(int money) {
        T result = null;
        int resultCost = 0;
        for (T i : freeObjects) {
            if((result == null || (rentPrices.get(i) < resultCost)) && rentPrices.get(i) < money)
            {
                result = i;
                resultCost = rentPrices.get(i);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        var result = new StringBuilder("Rental department. Free objects:\n");
        for (T i : freeObjects)
        {
            result.append(i.toString()).append(" with rent price ").append(rentPrices.get(i)).append("\n");
        }
        result.append("\nLeased objects:\n");
        for (T i : leasedObjects)
        {
            result.append(i.toString()).append(" with rent price ").append(rentPrices.get(i)).append("\n");
        }
        return result.toString();
    }
}
