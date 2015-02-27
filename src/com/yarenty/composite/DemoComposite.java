package com.yarenty.composite;

/**
 * Created by yarenty on 02/02/15.
 */
public class DemoComposite {
    public static void main(final String[] args) {

        System.out.println("\n\n ***COMPOSITE PATTERN***\n Composite pattern is used where we need to treat a group" +
                " of objects in similar way as a single object. Composite pattern composes objects in term of" +
                " a tree structure to represent part as well as whole hierarchy. Creates tree structure of group" +
                " of objects. This pattern creates a class that contains group of its own objects. This class" +
                " provides ways to modify its group of same objects. \n" +
                " Structural pattern.\n" +
                " \n\n");

        final Employee CEO = new Employee("John","CEO", 30000);

        final Employee headSales = new Employee("Robert","Head Sales", 20000);

        final Employee headMarketing = new Employee("Michel","Head Marketing", 20000);

        final Employee clerk1 = new Employee("Laura","Marketing", 10000);
        final Employee clerk2 = new Employee("Bob","Marketing", 10000);

        final Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        final Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //print all employees of the organization
        System.out.println(CEO);

        for (final Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);

            for (final Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
