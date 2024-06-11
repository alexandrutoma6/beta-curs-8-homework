package org.beta.curs8.homework.ex2.models;

import java.util.Date;

public class Programmer extends Employee {

    private String language;

    public Programmer(String name, Date dob, String address, String gender, Boolean married,
                      Date dateOfEmployment, String position, String language) {
        super(name, dob, address, gender, married, dateOfEmployment, position);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPosition() {
        return "programmer";
    }
}
