package com.yarenty.dao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yarenty on 18/02/2015.
 */
public class StudentDaoImpl implements StudentDao {

    List<Student> students;

    public StudentDaoImpl() {
        students = new ArrayList<Student>();
        final Student student1 = new Student("Robert", 1);
        final Student student2 = new Student("John", 2);
        students.add(student1);
        students.add(student2);
    }


    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public void deleteStudent(final Student student) {
        students.remove(student);
        System.out.println("Student: rollNo" + student.getRollNo() + ", deleted.");
    }


    @Override
    public Student getStudent(final int rollNo) {
        for (final Student student : students) {
            if (student.getRollNo() == rollNo) return student;
        }
        return null;
    }


    @Override
    public void updateStudent(final Student student) {
        for (final Student s : students) {
            if (student.getRollNo() == s.getRollNo()) s.setName(student.getName());
        }
    }
}
