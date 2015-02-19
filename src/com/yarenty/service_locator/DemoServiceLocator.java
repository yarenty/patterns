package com.yarenty.service_locator;

/**
 * Created by yarenty on 19/02/2015.
 */
public class DemoServiceLocator {

    public static void main(String[] args) {



        System.out.println("\n\n ***SERVICE LOCATOR PATTERN***\n The service locator design pattern is used" +
                " when we want to locate various services using JNDI lookup. Considering high cost of looking up" +
                " JNDI for a service, Service Locator pattern makes use of caching technique. For first time" +
                " a service is required, Service Locator looks up in JNDI and caches the service object. " +
                " further lookup or same service via Service Locator is done in its cache which improves performance" +
                " of application to great extent. Following are the entities of this type of design pattern:\n" +
                " > SERVICE - actual service which will process the request. Reference of such service is to be" +
                " looked upon in JNDI server.\n" +
                " > CONTEXT / INITIAL CONTEXT - JNDI context carries the reference to service used for lookup purpose.\n" +
                " > SERVICE LOCATOR - is a single point of contact to get services by JNDI lookup caching the services.\n" +
                " > CACHE - to store references of services to reuse them.\n" +
                " > CLIENT - is the object that invokes the services via ServiceLocator.\n " +
                " \n\n");

        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();

    }

}
