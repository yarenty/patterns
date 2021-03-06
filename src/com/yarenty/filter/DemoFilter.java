package com.yarenty.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yarenty on 02/02/15.
 */
public class DemoFilter {

    public static void main(final String[] args) {

        System.out.println("\n\n ***FILTER PATTERN***\n Filter pattern or Criteria pattern is a design pattern" +
                " that enables developers to filter a set of objects using different criteria and changing them in" +
                " a decoupled wat through logical operations. This pattern combines multiple criteria to obtain " +
                " single criteria.\n" +
                " Structural pattern.\n" +
                " \n\n");

        final List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        final Criteria male = new CriteriaMale();
        final Criteria female = new CriteriaFemale();
        final Criteria single = new CriteriaSingle();
        final Criteria singleMale = new AndCriteria(single, male);
        final Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(final List<Person> persons) {

        for (final Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]");
        }
    }

}
