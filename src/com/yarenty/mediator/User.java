package com.yarenty.mediator;


/**
 * Created by yarenty on 10/02/2015.
 */
public class User {
    private String name;

    public User(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void sendMessage(final String message) {
        ChatRoom.showMessage(this, message);
    }
}
