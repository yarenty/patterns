package com.yarenty.step_builder;

/**
 * Created by yarenty on 24/02/2015.
 */
public class ServerDetails {
    private final String host;
    private String user;
    private String password;

    public ServerDetails(final String host) {
        this.host = host;
    }

    public String getHost() {
        return host;
    }

    public String getUser() {
        return user;
    }

    public void setUser(final String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }
}

