package com.flaviovicentini.aula.domain.model;

public class Eletronic extends Product{
    private String brand;
    private int warranty;

    @Override
    public String toString() {
        return String.format("%s;%s,%d",
                super.toString(),
                brand,
                warranty);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
}
