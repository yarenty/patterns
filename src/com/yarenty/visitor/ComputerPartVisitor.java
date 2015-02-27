package com.yarenty.visitor;

/**
 * Created by yarenty on 17/02/2015.
 */
public interface ComputerPartVisitor {


    public void visit(final Computer computer);

    public void visit(final Keyboard keyboard);

    public void visit(final Mouse mouse);

    public void visit(final Monitor monitor);
}