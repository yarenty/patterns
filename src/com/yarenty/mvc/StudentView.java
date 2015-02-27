package com.yarenty.mvc;

/**
 * Created by yarenty on 18/02/2015.
 */
public class StudentView {

    public void printStudentDetails(final String studentName, final String studentRollNo) {
        System.out.println("Student::");
        System.out.println("Name:" + studentName);
        System.out.println("Roll No:" + studentRollNo);
    }
}
