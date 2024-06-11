package org.beta.curs8.homework.ex2;

import org.beta.curs8.homework.ex2.models.DatabaseAdmin;
import org.beta.curs8.homework.ex2.models.Employee;
import org.beta.curs8.homework.ex2.models.Person;
import org.beta.curs8.homework.ex2.models.Programmer;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //this Date class is a little bit complicated to use
        //maybe i use the wrong Date class
        Calendar cal = Calendar.getInstance();
        cal.set(2032, Calendar.DECEMBER, 6);
        Date date = cal.getTime();

        Person myPerson = new Person("Alex Toma", date, "mangalia", "male", false);

//        System.out.println(myPerson.getFirstName());
//        System.out.println(myPerson.getLastName());
//        System.out.println(myPerson.getDate());


        Calendar dateEmployment = Calendar.getInstance();
        dateEmployment.set(2032, Calendar.DECEMBER, 6);
        Date date2 = dateEmployment.getTime();


        Employee myEmployee = new Employee("Alex Toma", date, "mangalia", "male", false,
                date2, "programator2");

        Programmer myProgrammer = new Programmer("Alex Toma", date, "mangalia", "male", false,
                date2, "programator2", "java");

        System.out.println(myProgrammer.getPosition()); // --> programmer

        DatabaseAdmin myDatabaseAdmin = new DatabaseAdmin("Alex Toma", date, "mangalia", "male", false,
                date2, "programator2", "MongoDb");

        System.out.println(myDatabaseAdmin.getAddress()); // the address with prefix "db Admin"
    }
}
