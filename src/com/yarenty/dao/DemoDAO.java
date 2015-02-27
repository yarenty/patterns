package com.yarenty.dao;

/**
 * Created by yarenty on 18/02/2015.
 */
public class DemoDAO {

    public static void main(final String[] args) {


        System.out.println("\n\n ***DAO  PATTERN***\n Data Access Object Pattern is used to separate loe level data" +
                " accessing API or operations from high level business services. Following are the participants in" +
                " DAO:\n" +
                " > DATA ACCESS OBJECT INTERFACE - this interface defines standard operations to be performed on" +
                "a model objects.\n" +
                " > DATA ACCESS OBJECT CONCRETE CLASS - this class implements above interface. This class is" +
                " responsible to get data from a data source which can be database / xml or any other storage " +
                " mechanism.\n" +
                " MODEL OBJECT or VALUE OBJECT - this object is a simple POJO containing get/set methods to store data " +
                " retrieved using DAO class." +
                " \n" +
                " \n\n");

        final StudentDao studentDao = new StudentDaoImpl();

        for (final Student student : studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo:" + student.getRollNo() + ", name:" + student.getName() + "]");
        }

        final Student student = studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);

        studentDao.getStudent(1);
        System.out.println("UPDATE");
        System.out.println("Student: [RollNo:" + student.getRollNo() + ", name:" + student.getName() + "]");
        studentDao.deleteStudent(student);

        System.out.println("REMOVE");
        for (final Student s : studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo:" + s.getRollNo() + ", name:" + s.getName() + "]");
        }
    }
}
