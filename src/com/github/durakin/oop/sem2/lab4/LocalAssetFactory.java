package com.github.durakin.oop.sem2.lab4;

public class LocalAssetFactory implements AssetFactory{
    @Override
    public Asset createAsset(String assetDocumentCode) {
        return new LocalAsset(assetDocumentCode);
    }

}
