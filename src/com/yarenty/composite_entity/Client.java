package com.yarenty.composite_entity;

/**
 * Created by yarenty on 18/02/2015.
 */
public class Client {

    private final CompositeEntity compositeEntity = new CompositeEntity();

    public void printData() {
        for (int i = 0; i < compositeEntity.getData().length; i++) {
            System.out.println("Data:" + compositeEntity.getData()[i]);
        }
    }


    public void setData(final String d1, final String d2) {
        compositeEntity.setData(d1, d2);
    }
}
