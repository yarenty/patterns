package com.yarenty.service_locator;

/**
 * Created by yarenty on 19/02/2015.
 */
public class ServiceLocator {

    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(final String jndiName) {
        final Service service = cache.getService(jndiName);

        if (service != null) {
            return service;
        }

        final InitialContext context = new InitialContext();
        final Service service1 = (Service) context.lookup(jndiName);
        cache.addService(service1);
        return service1;

    }

}
