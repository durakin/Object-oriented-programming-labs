package com.github.durakin.oop.lab4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Flight {
    private final String NUMBER;
    private final Calendar DATE;
    private final List<Ticket> tickets;
    private String aircraft;

    public Flight(String number, Calendar date) {
        this.NUMBER = number;
        this.DATE = date;
        tickets = new ArrayList<>();
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void assignAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public Calendar getDATE() {
        return DATE;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Flight number " + NUMBER + '\n' +
                "Departure: " + DATE.get(Calendar.DAY_OF_MONTH) + '.' + DATE.get(Calendar.MONTH) +
                '.' + DATE.get(Calendar.YEAR) + " " +
                DATE.get(Calendar.HOUR) + ':' + DATE.get(Calendar.MINUTE) + '\n' +
                "Aircraft: " + ((aircraft == null) ? "\nNot assigned yet" : aircraft) + '\n' +
                "Tickets: \n");
        for (Ticket i : tickets) {
            result.append(i + "\n");
        }
        return result.toString();
    }
}
