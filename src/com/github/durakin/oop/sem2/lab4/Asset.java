package com.github.durakin.oop.sem2.lab4;


public abstract class Asset {

    private final String assetDocumentCode;

    Asset(String assetDocumentCode) {
        this.assetDocumentCode = assetDocumentCode;
    }

    public String getAssetDocumentCode() {
        return assetDocumentCode;
    }

    @Override
    public abstract String toString();
}
