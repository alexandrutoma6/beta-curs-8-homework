package org.beta.curs8.homework.ex1;

import org.beta.curs8.homework.ex1.models.Electronics;
import org.beta.curs8.homework.ex1.models.Fridge;
import org.beta.curs8.homework.ex1.models.Product;

public class Main {
    public static void main(String[] args) {
        Product myProduct = new Product(3.99, "myProduct", "a great product", 10d);
        Electronics myElectronic = new Electronics(23.99, "myElectronic",
                "a great product", 10d, "bathroom", 10.2, 10.2, 4d, 10d);
        Fridge myFridge = new Fridge(23.99, "myElectronic",
                "a great product", 10d, "bathroom",
                10.2, 10.2, 4d, 10d, -30d);


        System.out.println(myFridge.getTemperature());
        myFridge.increaseTemperature(10d);
        System.out.println(myFridge.getTemperature());
        myFridge.lowerTemperature(20d);
        System.out.println(myFridge.getTemperature());

        myFridge.isOn();
        myFridge.powerOn();
        myFridge.isOn();
        myFridge.powerOff();
        myFridge.isOn();
    }
}
