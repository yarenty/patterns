package com.yarenty.iterator;

/**
 * Created by yarenty on 10/02/2015.
 */
public class DemoIteratorPattern {

    public static void main(String[] args) {

        System.out.println("\n\n **ITERATOR PATTERN*** \n Iterator pattern is very commonly used design pattern" +
                " in Java and .net programming environment. This pattern is used to get a wat to access the elements" +
                " of a collection object in sequential manner without any need to know its underlying representation." +
                " \n" +
                " Behavioral pattern.\n" +
                " \n\n" );

        NameRepository nameRepository = new NameRepository();

        for(Iterator iter = nameRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name:"+name);
        }
    }

}
