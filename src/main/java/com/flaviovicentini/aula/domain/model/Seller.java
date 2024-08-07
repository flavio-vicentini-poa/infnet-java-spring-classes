package com.flaviovicentini.aula.domain.model;

import java.util.List;

public class Seller {
    private String name;
    private String cpf;
    private String email;
    private List<Product> products;

    @Override
    public String toString() {
        return name + ";" + cpf + ";" + email + ";" + products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
