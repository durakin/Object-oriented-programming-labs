package com.github.durakin.oop.lab8;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        var restaurant = new Restaurant();
        var rosstat = new Rosstat();
        restaurant.AddCustomer(new Customer("Customer 1", 54, 1000));
        restaurant.AddCustomer(new Customer("Customer 2", 67, 1776));
        restaurant.AddCustomer(new Customer("Customer 3", 80, 1861));
        System.out.println(restaurant);

        var outputStream = new ObjectOutputStream(new FileOutputStream("data.bin"));
        restaurant.SerializeStats(outputStream);
        outputStream.close();

        var inputStream = new ObjectInputStream(new FileInputStream("data.bin"));
        rosstat.DeserializeStats(inputStream);
        inputStream.close();

        System.out.println(rosstat);
        System.out.println("Mean bill: " + rosstat.CalculateMeanBill());
    }

}
