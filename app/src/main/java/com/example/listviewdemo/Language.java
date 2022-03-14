package com.example.listviewdemo;

public class Language {
    private String name;
    private String shopNames;
    private int image;

    public Language(String name, String shopNames, int image) {
        this.name = name;
        this.shopNames = shopNames;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopNames() {
        return shopNames;
    }

    public void setShopNames(String shopNames) {
        this.shopNames = shopNames;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
