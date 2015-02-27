package com.yarenty.transfer_object;

/**
 * Created by yarenty on 19/02/2015.
 */
public class StudentVO {

    private String name;
    private int rollNo;

    StudentVO(final String name, final int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(final int rollNo) {
        this.rollNo = rollNo;
    }
}
