package com.yarenty.observer;

/**
 * Created by yarenty on 10/02/2015.
 */
public class OctalObserver extends Observer {

    public OctalObserver(final Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
