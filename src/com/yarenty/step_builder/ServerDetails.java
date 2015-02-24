package com.yarenty.step_builder;

/**
 * Created by yarenty on 24/02/2015.
 */
public class ServerDetails {
    private final String host;
    private String user;
    private String password;

    public ServerDetails(String host) {
        this.host = host;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getHost() {
        return host;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}

