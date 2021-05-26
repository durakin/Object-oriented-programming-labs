package com.github.durakin.oop.sem2.lab4;


public class Asset {

    private final String assetDocumentCode;

    Asset(String assetDocumentCode) {
        this.assetDocumentCode = assetDocumentCode;
    }

    @Override
    public String toString() {
        return "Asset by document with number " + assetDocumentCode + "\n";
    }
}
