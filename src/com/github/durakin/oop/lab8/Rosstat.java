package com.github.durakin.oop.lab8;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Rosstat {
    private final List<Customer> CUSTOMERS;

    public Rosstat() {
        this.CUSTOMERS = new ArrayList<>();
    }

    public void DeserializeStats(ObjectInputStream inputStream) {
        try {
            Customer customer;
            while ((customer = (Customer) inputStream.readObject()) != null) {
                CUSTOMERS.add(customer);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public double CalculateMeanBill() {
        var mean = .0;
        if (!CUSTOMERS.isEmpty()) {
            for (var customer : CUSTOMERS) {
                mean += customer.getBILL();
            }
            mean /= CUSTOMERS.size();
        }
        return mean;
    }

    @Override
    public String toString() {
        var result = new StringBuilder();
        for (var i : CUSTOMERS) {
            result.append(i).append("\n");
        }
        return result.toString();
    }
}
