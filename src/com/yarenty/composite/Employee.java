package com.yarenty.composite;

/**
 * Created by yarenty on 02/02/15.
 */

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    // constructor
    public Employee(final String name, final String dept, final int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee>();
    }

    public void add(final Employee e) {
        subordinates.add(e);
    }

    public void remove(final Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public String toString() {
        return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary + " ]");
    }
}