package org.beta.curs8.homework.ex2.models;

import java.util.Date;

public class Employee extends Person {

    private Date dateOfEmployment;
    private String position;

    public Employee(String name, Date dob, String address, String gender, Boolean married,
                    Date dateOfEmployment, String position) {
        super(name, dob, address, gender, married);
        this.dateOfEmployment = dateOfEmployment;
        this.position = position;
    }

    public Date getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
