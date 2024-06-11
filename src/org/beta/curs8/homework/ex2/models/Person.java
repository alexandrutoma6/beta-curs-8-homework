package org.beta.curs8.homework.ex2.models;

import org.beta.curs8.homework.ex2.interfaces.Human;
import org.beta.curs8.homework.ex2.services.ValidateService;

import java.time.LocalDate;

public class Person implements Human {

    private String name;
    private LocalDate dob;
    private String address;
    private String gender;
    private Boolean married;


    public Person(String name, LocalDate dob, String address, String gender, Boolean married) {

        if (ValidateService.containsFirstAndLastName(name)) {
            this.name = name;
        }
        //even if the date is invalid, it sets the dob as null
        if (ValidateService.isBirthDateBeforeToday(dob)) {
            this.dob = dob;
        }
        if (ValidateService.genderValidation(gender)) {
            this.gender = gender;
        }
        this.address = address;
        this.married = married;
    }

    public Boolean isMarried() {
        return married;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String getFirstName() {
        String[] names = name.split(" ");
        return names[0];
    }

    @Override
    public String getLastName() {
        String[] names = name.split(" ");
        return names[1];
    }

    @Override
    public LocalDate getDate() {
        return dob;
    }

    @Override
    public String getAddress() {
        return address;
    }
}
