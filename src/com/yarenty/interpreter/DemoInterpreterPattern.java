package com.yarenty.interpreter;

/**
 * Created by yarenty on 10/02/2015.
 */
public class DemoInterpreterPattern {


    //Rule:John and Robert are male
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert,john);
    }

    //Rule: Julie is a married women
    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }


    public static void main(String[] args) {

        System.out.println("\n\n **INTERPRETER PATTERN*** \n Interpreter pattern provides a way to evaluate" +
                " language grammar or expression. This pattern involves implementing an expression interface" +
                " which tells to interpret a particular context. This pattern is used in SQL parsing," +
                " symbol processing engine etc." +
                " \n" +
                " Behavioral pattern.\n" +
                " \n\n" );


        Expression isMale = getMaleExpression();
        Expression isMarriedWomen = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married woman? "+ isMarriedWomen.interpret("Married Julie"));
    }

}
