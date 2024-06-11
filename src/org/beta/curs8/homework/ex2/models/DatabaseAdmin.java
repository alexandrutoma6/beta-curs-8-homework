package org.beta.curs8.homework.ex2.models;

import java.util.Date;

public class DatabaseAdmin extends Employee {

    private String dbTechnology;

    public DatabaseAdmin(String name, Date dob, String address, String gender, Boolean married,
                         Date dateOfEmployment, String position, String dbTechnology) {
        super(name, dob, address, gender, married, dateOfEmployment, position);
        this.dbTechnology = dbTechnology;
    }

    public String getDbTechnology() {
        return dbTechnology;
    }

    public void setDbTechnology(String dbTechnology) {
        this.dbTechnology = dbTechnology;
    }

    public String getAddress() {
        return "dbAdmin--" + super.getAddress();
    }
}
