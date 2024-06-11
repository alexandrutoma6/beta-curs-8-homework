package org.beta.curs8.homework.ex1.models;

public class Cosmetics extends Product {

    private String color;
    private Double weight;

    public Cosmetics(Double price, String name, String description, Double quantity, String color, Double weight) {
        super(price, name, description, quantity);
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
