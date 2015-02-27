package com.yarenty.filter;

/**
 * Created by yarenty on 02/02/15.
 */
public class Person {

    private String name;
    private String gender;
    private String maritalStatus;

    public Person(final String name, final String gender, final String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}
