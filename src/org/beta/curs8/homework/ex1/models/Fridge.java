package org.beta.curs8.homework.ex1.models;

import java.util.Scanner;

public class Fridge extends Electronics {

    private Double temperature;
    private boolean isOn = false;

    public Fridge(Double price, String name, String description, Double quantity,
                  String type, Double length, Double width, Double height, Double weight,
                  Double temperature) {
        super(price, name, description, quantity, type, length, width, height, weight);
        this.temperature = temperature;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public void lowerTemperature(Double amount) {
        temperature -= amount;
    }

    public void increaseTemperature(Double amount) {
        temperature += amount;
    }

    public void isOn() {
        System.out.println(isOn);
    }


    public void powerOn() {
        if (!isOn) {
            System.out.println("It will take 10 seconds to power on the Fridge");
            isOn = true;
        } else {
            System.out.println("The fridge is already ON");
        }
    }

    //the powerOff method have a user validation to confirm turning off the fridge
    public void powerOff() {
        if (isOn) {
            String[] regex = {"y", "Y", "yes", "Yes", "YES"};
            Scanner sc = new Scanner(System.in);

            System.out.println("Are you sure you want to power off? (yes/no)");
            String input = sc.next();

            boolean sure = false;
            for (String validYes : regex) {
                if (input.equals(validYes)) {
                    sure = true;
                    break;
                }
            }

            if (sure) {
                System.out.println("Powering off...");
                isOn = false;
            } else {
                System.out.println("Power off cancelled.");
            }
        } else {
            System.out.println("The fridge is already OFF");
        }
    }
}
