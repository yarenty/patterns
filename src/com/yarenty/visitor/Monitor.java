package com.yarenty.visitor;

/**
 * Created by yarenty on 17/02/2015.
 */
public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
