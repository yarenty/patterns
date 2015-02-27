package com.yarenty.memento;

/**
 * Created by yarenty on 10/02/2015.
 */
public class Memento {

    String state;

    public Memento(final String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
