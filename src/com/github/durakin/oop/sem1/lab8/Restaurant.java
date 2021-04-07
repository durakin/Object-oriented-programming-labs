package com.github.durakin.oop.sem1.lab8;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private final List<Customer> CUSTOMERS;

    public Restaurant() {
        this.CUSTOMERS = new ArrayList<>();
    }

    public void AddCustomer(Customer customer) {
        this.CUSTOMERS.add(customer);
    }

    public void SerializeStats(ObjectOutputStream outputStream) {
        try {
            for (var customer : this.CUSTOMERS) {
                if (customer.getAGE() >= 65)
                    outputStream.writeObject(customer);
            }
            outputStream.writeObject(null);
        } catch (IOException e) {
            e.printStackTrace();
        }
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

