package com.yarenty.prototype;

/**
 * Created by yarenty on 02/02/15.
 */
public abstract class Shape implements Cloneable {

    protected String type;
    private String id;

    abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}