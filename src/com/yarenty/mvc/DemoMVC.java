package com.yarenty.mvc;

/**
 * Created by yarenty on 18/02/2015.
 */
public class DemoMVC {

    public static void main(final String[] args) {


        System.out.println("\n\n ***MCV PATTERN***\n MVC pattern is used to separate application's concerns:\n" +
                " > MODEL - model represents object or java POJO carrying data. It can also have logic to update" +
                " controller if its data changes.\n" +
                " > VIEW - view represents the visualization of the data that model contains.\n" +
                " > CONTROLLER = controller acts on both model and view. It controls the data flow into model object" +
                " and updates the view whenever data changes. It keeps view and model separate.\n" +
                " Behavior pattern.\n" +
                " \n\n");


        final Student model = retrieveStudent();

        final StudentView view = new StudentView();

        final StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("John");

        controller.updateView();
    }


    private static Student retrieveStudent() {
        final Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }

}
