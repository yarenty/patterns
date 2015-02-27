package com.yarenty.mediator;

import java.util.Date;

/**
 * Created by yarenty on 10/02/2015.
 */
public class ChatRoom {
    public static void showMessage(final User user, final String message) {
        System.out.println(new Date().toString() + ": [" + user.getName() + "]:: " + message);
    }

}
