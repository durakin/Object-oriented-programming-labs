package com.github.durakin.oop.lab4;

public class Ticket {
    private static final int ECONOMY_CLASS = 1;
    private static final int STANDART_CLASS = 2;
    private static final int BUSINESS_CLASS = 3;

    private final int SEATCLASS;

    private Passenger passenger;

    public Ticket( int seatClass) {
        SEATCLASS = seatClass;
    }

    public void sellTo(Passenger passenger) {
        this.passenger = passenger;
    }

    public void refund() {
        this.passenger = null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("TICKET\nClass: ");
        switch (SEATCLASS) {
            case ECONOMY_CLASS:
                result.append("Economy");
                break;
            case STANDART_CLASS:
                result.append("Standart");
                break;
            case BUSINESS_CLASS:
                result.append("Business");
            default:
                break;
        }
        result.append((passenger == null) ? "\nNot sold\n" : "\n" + passenger);
        return result.toString();
    }


}
