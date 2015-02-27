package com.yarenty.visitor;

/**
 * Created by yarenty on 17/02/2015.
 */
public class Mouse implements ComputerPart {

    @Override
    public void accept(final ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
