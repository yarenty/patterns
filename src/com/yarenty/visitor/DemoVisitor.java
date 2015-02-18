package com.yarenty.visitor;

/**
 * Created by yarenty on 17/02/2015.
 */
public class DemoVisitor {


    public static void main(String[] args) {


        System.out.println("\n\n ***VISITOR PATTERN***\n In visitor pattern, we use a visitor class which changes" +
                " the executing algorithm of an element class. By this way, execution algorithm of element can vary" +
                " as and when visitor varies.\n" +
                " Behavior pattern.\n" +
                " \n" +
                " As per pattern, element object hat to accept the visitor object so that visitor handles the" +
                " operation on the element object.\n\n");
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
