package com.yarenty.service_locator;

/**
 * Created by yarenty on 19/02/2015.
 */
public class InitialContext {

    public Object lookup(String jndiName) {

        if (jndiName.equalsIgnoreCase("SERVICE1")) {
            System.out.println("Looking up and creating service1 object.");
            return new Service1();
        } else  if (jndiName.equalsIgnoreCase("SERVICE2")) {
            System.out.println("Looking up and creating service2 object.");
            return new Service2();
        }
        return null;
    }

}
