package com.yarenty.step_builder;

/**
 * Created by yarenty on 24/02/2015.
 */
public class UserConfiguration {

    private final String name;
    private ServerDetails serverDetails;

    public UserConfiguration(String name) {
        this.name = name;
    }

    public void setServerDetails(ServerDetails serverDetails) {
        this.serverDetails = serverDetails;
    }

    public String getName() {
        return name;
    }

    public ServerDetails getServerDetails() {
        return serverDetails;
    }
}
