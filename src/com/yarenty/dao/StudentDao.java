package com.yarenty.dao;

import java.util.List;

/**
 * Created by yarenty on 18/02/2015.
 */
public interface StudentDao {

    public List<Student> getAllStudents();
    public Student getStudent( int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);

}
