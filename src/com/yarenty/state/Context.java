package com.yarenty.state;

/**
 * Created by yarenty on 16/02/2015.
 */
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(final State state) {
        this.state = state;
    }
}
