package com.yarenty.composite_entity;

/**
 * Created by yarenty on 18/02/2015.
 */
public class Client {

    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData() {
        for( int i =0; i<compositeEntity.getData().length; i++) {
            System.out.println("Data:"+ compositeEntity.getData()[i]);
        }
    }


    public void setData(String d1, String d2) {
        compositeEntity.setData(d1,d2);
    }
}
