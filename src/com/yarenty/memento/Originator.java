package com.yarenty.memento;

/**
 * Created by yarenty on 10/02/2015.
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(final Memento memento) {
        state = memento.getState();
    }

}
