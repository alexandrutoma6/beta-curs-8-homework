package org.beta.curs8.homework.ex1.models;

public class Electronics extends Product {

    private String type;
    private Double length;
    private Double width;
    private Double height;
    private Double weight;


    public Electronics(Double price, String name, String description, Double quantity,
                       String type, Double length, Double width, Double height, Double weight) {
        super(price, name, description, quantity);
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void powerOn() {
        System.out.println("Powered ON");
    }

    public void powerOff() {
        System.out.println("Powered OFF");
    }
}
