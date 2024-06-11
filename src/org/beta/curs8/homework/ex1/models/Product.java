package org.beta.curs8.homework.ex1.models;

public class Product {

    private final Double price;
    private final String name;
    private final String description;
    private final Double quantity;

    public Product(Double price, String name, String description, Double quantity) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getQuantity() {
        return quantity;
    }

}
