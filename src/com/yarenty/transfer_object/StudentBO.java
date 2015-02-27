package com.yarenty.transfer_object;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yarenty on 19/02/2015.
 */
public class StudentBO {

    List<StudentVO> students;

    public StudentBO() {
        students = new ArrayList<StudentVO>();
        final StudentVO s1 = new StudentVO("Robby", 0);
        final StudentVO s2 = new StudentVO("John", 1);
        students.add(s1);
        students.add(s2);
    }

    public void deleteStudent(final StudentVO student) {
        students.remove(student.getRollNo()); //just works by coincidence...
        System.out.println("Student: Roll No:" + student.getRollNo() + ", deleted..");
    }

    public List<StudentVO> getAllStudents() {
        return students;
    }

    public StudentVO getStudent(final int rollNo) {
        return students.get(rollNo);
    }

    public void updateStudent(final StudentVO student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No:" + student.getRollNo() + ", updated..");
    }

}
