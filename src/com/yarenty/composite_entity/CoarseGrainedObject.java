package com.yarenty.composite_entity;

/**
 * Created by yarenty on 18/02/2015.
 */
public class CoarseGrainedObject {

    DependentObject1 do1 = new DependentObject1();
    DependentObject2 do2 = new DependentObject2();

    public void setData(String d1, String d2){
        do1.setData(d1);
        do2.setData(d2);
    }

    public String[] getData() {
        return new String[] {do1.getData(), do2.getData()};
    }

}
