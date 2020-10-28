package com.github.durakin.oop.lab4;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight("305", new GregorianCalendar(1971, Calendar.NOVEMBER, 24, 14, 50));
        System.out.println(flight);
        flight.assignAircraft("N467US");
        Queue<Ticket> ticketsToSell;
        ticketsToSell = new LinkedList<>();

        for (int i = 0; i < 3; i++) {
            Ticket ticket = new Ticket(1);
            flight.addTicket(ticket);
            ticketsToSell.add(ticket);
        }
        ticketsToSell.poll().sellTo(new Passenger("D. B. Cooper", "PASSPORTNUMBER"));
        ticketsToSell.poll().sellTo(new Passenger("Alice Hancock", "PASSPORTNUMBER"));

        System.out.println(flight);

    }
}
