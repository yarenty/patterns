package com.yarenty.step_builder;

/**
 * Created by yarenty on 24/02/2015.
 */
public class UserConfiguration {

    private final String name;
    private ServerDetails serverDetails;

    public UserConfiguration(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ServerDetails getServerDetails() {
        return serverDetails;
    }

    public void setServerDetails(final ServerDetails serverDetails) {
        this.serverDetails = serverDetails;
    }
}
