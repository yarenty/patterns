package com.yarenty.visitor;

/**
 * Created by yarenty on 17/02/2015.
 */
public interface ComputerPart {
    public void accept(final ComputerPartVisitor computerPartVisitor);
}
