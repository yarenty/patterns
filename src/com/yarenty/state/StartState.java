package com.yarenty.state;

/**
 * Created by yarenty on 16/02/2015.
 */
public class StartState implements State {

    @Override
    public void doAction(final Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start state";
    }
}
