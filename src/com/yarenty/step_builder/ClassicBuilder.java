package com.yarenty.step_builder;

/**
 * Created by yarenty on 24/02/2015.
 */
public class ClassicBuilder {

    private String name;
    private String host;
    private String user;
    private String password;

    public ClassicBuilder(String name) {
        this.name = name;
    }

    public ClassicBuilder onLocalHost() {
        this.host = "localhost";
        return this;
    }

    public ClassicBuilder onRemoteHost(String remoteHost){
        this.host = remoteHost;
        return this;
    }

    public ClassicBuilder credentials(String user, String password) {
        this.user = user;
        this.password = password;
        return this;
    }

    public UserConfiguration build() {
        UserConfiguration userConfiguration = new UserConfiguration(name);
        ServerDetails serverDetails = new ServerDetails(host);
        serverDetails.setUser(user);
        serverDetails.setPassword(password);
        userConfiguration.setServerDetails(serverDetails);

        System.out.println("HOST:"+host+" user:"+user+" pass:"+password + "  ////"+name);

        return userConfiguration;
    }

}
