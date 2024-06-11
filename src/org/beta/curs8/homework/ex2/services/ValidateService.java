package org.beta.curs8.homework.ex2.services;

import java.util.Date;

public class ValidateService {

    //verify if the name have First and Last name
    public static Boolean nameValidation(String name) {
        String[] nameArray = name.split(" ");

        return nameArray.length >= 2;
    }

    //verify if the date of birth is valid
    //the validation on date doesn't work as intended...
    public static Boolean dateValidation(Date date) {
        Date today = new Date();
        return date.before(today);
    }

    //validate gender
    public static Boolean genderValidation(String gender) {
        String[] genders = {"male", "female"};
        for (String gen : genders) if (gender.equals(gen)) return true;
        return false;
    }

}
