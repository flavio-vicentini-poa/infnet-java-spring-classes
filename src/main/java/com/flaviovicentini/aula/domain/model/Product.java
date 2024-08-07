package com.flaviovicentini.aula.domain.model;

public class Product {
    private String description;
    private int code;
    private float price;
    private boolean hasInventory;

    @Override
    public String toString() {
        return String.format("%d;%s;%.2f;%b",
                code,
                description,
                price,
                hasInventory ? "yes" : "no");
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isHasInventory() {
        return hasInventory;
    }

    public void setHasInventory(boolean hasInventory) {
        this.hasInventory = hasInventory;
    }
}
