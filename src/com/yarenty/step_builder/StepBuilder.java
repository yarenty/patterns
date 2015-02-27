package com.yarenty.step_builder;

/**
 * Created by yarenty on 24/02/2015.
 */
public class StepBuilder {

    private StepBuilder() {
    }

    public static NameStep newBuilder() {
        return new Steps();
    }

    public static interface NameStep {

        /**
         * @param name unique identifier for this User Configuration
         * @return
         */
        ServerStep name(String name);
    }

    public static interface ServerStep {

        /**
         * The hostname will be localhost
         *
         * @return
         */
        public BuildStep onLocalhost();

        /**
         * @param host
         * @return
         */
        public CredentialsStep onRemoteHost(String host);
    }

    public static interface CredentialsStep {
        /**
         * username and password required to connect to remote machine
         *
         * @param user
         * @param password
         * @return
         */
        public BuildStep credentials(String user, String password);
    }

    public static interface BuildStep {
        /**
         * instance of user configuration based on the parameters passed during creation
         *
         * @return
         */
        public UserConfiguration build();
    }


    private static class Steps implements NameStep, ServerStep, CredentialsStep, BuildStep {

        private String name;
        private String host;
        private String user;
        private String password;

        @Override
        public BuildStep onLocalhost() {
            host = "localhost";
            return this;
        }


        @Override
        public ServerStep name(String name) {
            this.name = name;
            return this;
        }

        @Override
        public CredentialsStep onRemoteHost(String host) {
            this.host = host;
            return this;
        }

        @Override
        public BuildStep credentials(String user, String password) {
            this.user = user;
            this.password = password;
            return this;
        }

        @Override
        public UserConfiguration build() {
            UserConfiguration userConfiguration = new UserConfiguration(name);
            ServerDetails serverDetails = new ServerDetails(host);
            serverDetails.setUser(user);
            serverDetails.setPassword(password);
            userConfiguration.setServerDetails(serverDetails);

            System.out.println("HOST:" + host + " user:" + user + " pass:" + password + "  ////" + name);

            return userConfiguration;
        }
    }


}
