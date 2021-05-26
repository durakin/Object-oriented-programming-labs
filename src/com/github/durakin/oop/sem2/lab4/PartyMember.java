package com.github.durakin.oop.sem2.lab4;

import java.util.ArrayList;
import java.util.List;


public class PartyMember {
    private final int CARD_NUMBER;
    private final String NAME;
    private final String LAST_NAME;
    private final List<Asset> ASSETS;

    public PartyMember(int CARD_NUMBER, String NAME, String LAST_NAME) {
        this.CARD_NUMBER = CARD_NUMBER;
        this.NAME = NAME;
        this.LAST_NAME = LAST_NAME;
        this.ASSETS = new ArrayList<>();
    }

    public void addProperty(String assetDocumentCode) {
        this.ASSETS.add(new Asset(assetDocumentCode));
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Party member with party card number " + this.CARD_NUMBER +
                "\nName: " + this.NAME + " " + this.LAST_NAME +
                "\nProperty:\n");
        for (Asset i : this.ASSETS) {
            result.append("* ").append(i.toString()).append('\n');
        }
        return result.toString();
    }
}
