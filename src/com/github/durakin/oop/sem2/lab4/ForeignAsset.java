package com.github.durakin.oop.sem2.lab4;

public class ForeignAsset extends Asset {
    public ForeignAsset(String assetDocumentCode) {
        super(assetDocumentCode);
    }

    @Override
    public String toString() {
        return "Foreign asset by document with number " + super.getAssetDocumentCode() + "\n";
    }
}

