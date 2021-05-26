package com.github.durakin.oop.sem2.lab3;


public class Controller {

    private static final Party party = new Party();

    public static int addMember(String name, String lastname) {
        return party.addMember(name, lastname);
    }

    public static String partyMemberReportByCard(int cardNumber) {
        return party.partyMemberReportByCard(cardNumber);
    }

    public static boolean addProperty(int cardNumber, String assetDocumentCode) {
            return party.addProperty(cardNumber, assetDocumentCode);
    }
}
