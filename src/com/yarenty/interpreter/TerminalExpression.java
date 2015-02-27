package com.yarenty.interpreter;

/**
 * Created by yarenty on 10/02/2015.
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(final String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(final String context) {

        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
