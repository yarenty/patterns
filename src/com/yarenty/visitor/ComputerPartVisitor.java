package com.yarenty.visitor;

/**
 * Created by yarenty on 17/02/2015.
 */
public interface ComputerPartVisitor {


    public void visit(Computer computer);
    public void visit(Keyboard keyboard);
    public void visit(Mouse mouse);
    public void visit(Monitor monitor);
}