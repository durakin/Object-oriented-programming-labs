package com.github.durakin.oop.sem2.lab4;


public class Controller {

    private static Controller uniqueInstance;

    private final Party party;

    private Controller() {
        party = new Party();
        uniqueInstance = this;
    }

    public static Controller getInstance() {
        return uniqueInstance == null ? new Controller() : uniqueInstance;
    }

    public int addMember(String name, String lastname) {
        return party.addMember(name, lastname);
    }

    public String partyMemberReportByCard(int cardNumber) {
        return party.partyMemberReportByCard(cardNumber);
    }

    public boolean addProperty(int cardNumber, String assetDocumentCode) {
            return party.addProperty(cardNumber, assetDocumentCode);
    }
}
