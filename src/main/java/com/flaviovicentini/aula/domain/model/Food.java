package com.flaviovicentini.aula.domain.model;

public class Food extends Product {
    private boolean isOrganic;
    private String traits;

    @Override
    public String toString() {
        return String.format("%s;%b;%s",
                super.toString(),
                isOrganic,
                traits);
    }

    public boolean isOrganic() {
        return isOrganic;
    }

    public void setOrganic(boolean organic) {
        isOrganic = organic;
    }

    public String getTraits() {
        return traits;
    }

    public void setTraits(String traits) {
        this.traits = traits;
    }
}
