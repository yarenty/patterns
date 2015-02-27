package com.yarenty.interpreter;

/**
 * Created by yarenty on 10/02/2015.
 */
public class OrExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    public OrExpression(final Expression expr1, final Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(final String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
