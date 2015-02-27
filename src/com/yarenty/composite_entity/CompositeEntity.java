package com.yarenty.composite_entity;

/**
 * Created by yarenty on 18/02/2015.
 */
public class CompositeEntity {

    private final CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(final String d1, final String d2) {
        cgo.setData(d1, d2);
    }


    public String[] getData() {
        return cgo.getData();
    }
}
