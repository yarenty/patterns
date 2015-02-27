package com.yarenty.visitor;

/**
 * Created by yarenty on 17/02/2015.
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(final Computer computer) {
        System.out.println("Displaying computer");
    }


    @Override
    public void visit(final Keyboard keyboard) {
        System.out.println("Displaying keyboard");
    }

    @Override
    public void visit(final Monitor monitor) {
        System.out.println("Displaying monitor");
    }


    @Override
    public void visit(final Mouse mouse) {
        System.out.println("Displaying mouse");
    }
}
