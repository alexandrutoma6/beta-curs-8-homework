package org.beta.curs8.homework.ex3.models;

import org.beta.curs8.homework.ex2.models.Person;

import java.time.LocalDate;
import java.time.Period;

public class PersonService {

    private final Person person;

    public PersonService(Person person) {
        this.person = person;
    }

    public String getName() {
        return person.getFirstName() + " " + person.getLastName();
    }

    //calculate the difference between the dob and the today date, and return the years
    public Integer getAge() {
        return Period.between(person.getDate(), LocalDate.now()).getYears();
    }
}
