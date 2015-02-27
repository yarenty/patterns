package com.yarenty.dao;

/**
 * Created by yarenty on 18/02/2015.
 */
public class Student {

    private int rollNo;
    private String name;

    public Student(final String name, final int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(final int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
