package com.yarenty.mvc;

/**
 * Created by yarenty on 18/02/2015.
 */
public class StudentController {

    private Student model;
    private StudentView view;


    public StudentController(final Student model, final StudentView view) {
        this.model = model;
        this.view = view;
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentName(final String name) {
        model.setName(name);
    }

    public String getStudentRollNo() {
        return model.getRollNo();
    }

    public void setStudentRollNo(final String rollNo) {
        model.setRollNo(rollNo);
    }

    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
