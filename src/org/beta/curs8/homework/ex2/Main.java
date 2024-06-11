package org.beta.curs8.homework.ex2;

import org.beta.curs8.homework.ex2.models.DatabaseAdmin;
import org.beta.curs8.homework.ex2.models.Employee;
import org.beta.curs8.homework.ex2.models.Person;
import org.beta.curs8.homework.ex2.models.Programmer;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2002, 12, 6);

        Person myPerson = new Person("Alex Toma", date, "mangalia", "male", false);

        System.out.println(myPerson.getFirstName());
        System.out.println(myPerson.getLastName());
        System.out.println(myPerson.getDate());

        LocalDate dateEmployment = LocalDate.of(2032, 12, 6);

        Employee myEmployee = new Employee("Alex Toma", date, "mangalia", "male", false,
                dateEmployment, "programator2");

        Programmer myProgrammer = new Programmer("Alex Toma", date, "mangalia", "male", false,
                dateEmployment, "programator2", "java");

        System.out.println(myProgrammer.getPosition()); // --> programmer

        DatabaseAdmin myDatabaseAdmin = new DatabaseAdmin("Alex Toma", date, "mangalia", "male", false,
                dateEmployment, "programator2", "MongoDb");

        System.out.println(myDatabaseAdmin.getAddress()); // the address with prefix "db Admin"
    }
}
