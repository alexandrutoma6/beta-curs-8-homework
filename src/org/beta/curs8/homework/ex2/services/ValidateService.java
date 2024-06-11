package org.beta.curs8.homework.ex2.services;

import java.time.LocalDate;

public class ValidateService {

    //verify if the name have First and Last name
    public static Boolean containsFirstAndLastName(String name) {
        String[] nameArray = name.split(" ");

        return nameArray.length >= 2;
    }

    //verify if the date of birth is valid
    public static Boolean isBirthDateBeforeToday(LocalDate date) {
        LocalDate today = LocalDate.now();
        return date.isBefore(today);
    }

    //validate gender
    public static Boolean genderValidation(String gender) {
        String[] genders = {"male", "female"};
        for (String gen : genders) if (gender.equals(gen)) return true;
        return false;
    }

}
