package org.beta.curs8.homework.ex2.models;

import java.time.LocalDate;

public class Employee extends Person {

    private LocalDate dateOfEmployment;
    private String position;

    public Employee(String name, LocalDate dob, String address, String gender, Boolean married,
                    LocalDate dateOfEmployment, String position) {
        super(name, dob, address, gender, married);
        this.dateOfEmployment = dateOfEmployment;
        this.position = position;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
