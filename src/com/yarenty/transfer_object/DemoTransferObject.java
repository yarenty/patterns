package com.yarenty.transfer_object;

/**
 * Created by yarenty on 19/02/2015.
 */
public class DemoTransferObject {

    public static void main(String[] args) {

        System.out.println("\n\n ***TRANSFER OBJECT PATTERN***\n The transfer object design pattern is used" +
                " when we want to pass data with multiple attributes in one shot from client to server. Transfer" +
                " object is also known as Value Object. Transfer Object is a simple POJO class having getter/setter" +
                " methods and is serializable so that it can be transferred over the network. It does not have any" +
                " behavior. Server Side business class normally fetches data from the database and fills the POJO" +
                " and send it to the client or pass it by value. For client, transfer object is read only. Client" +
                " can create its own transfer object and pass it to server to update values in database in one shot." +
                " Following are the entities of this type of design pattern:\n" +
                " > BUSINESS OBJECT - business service fills the transfer object with data.\n" +
                " > TRANSFER OBJECT - simple POJO having methods to set/get attributes only.\n" +
                " > CLIENT - either requests or sends the transfer object to business object.\n" +
                " \n\n");


        StudentBO studentBO = new StudentBO();

        for (StudentVO student: studentBO.getAllStudents()) {
            System.out.println("Student: Roll No:"+student.getRollNo()+", name::"+student.getName());
        }


        StudentVO student = studentBO.getAllStudents().get(0);
        student.setName("Michael");
        studentBO.updateStudent(student);

        student = studentBO.getStudent(0);

        System.out.println("Student: Roll No:"+student.getRollNo()+", name::"+student.getName());
    }

}
