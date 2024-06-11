package org.beta.curs8.homework.ex3;

import org.beta.curs8.homework.ex2.models.Person;
import org.beta.curs8.homework.ex3.models.PersonService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2002, 12, 6);
        Person myPerson = new Person("Alex Toma", date, "mangalia", "male", false);

        PersonService service = new PersonService(myPerson);

        System.out.println(service.getName());
        System.out.println(service.getAge());

    }
}
