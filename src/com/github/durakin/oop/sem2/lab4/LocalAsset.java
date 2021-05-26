package com.github.durakin.oop.sem2.lab4;

public class LocalAsset extends Asset{
    LocalAsset(String assetDocumentCode) {
        super(assetDocumentCode);
    }

    @Override
    public String toString() {
        return "Local asset by document with number " + super.getAssetDocumentCode() + "\n";
    }
}
