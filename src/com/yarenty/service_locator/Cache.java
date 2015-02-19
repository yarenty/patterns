package com.yarenty.service_locator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yarenty on 19/02/2015.
 */
public class Cache {

    private List<Service> services;

    public Cache() {
        services = new ArrayList<Service>();
    }

    public Service getService(String serviceName) {

        for (Service service:services) {
            if (service.getName().equalsIgnoreCase(serviceName)) {
                System.out.println("Returning cached ["+serviceName+"] object");
                return service;
            }
        }
        return null;
    }

    public void addService(Service newService) {
        boolean exist=false;

        for( Service service: services) {
            if (service.getName().equalsIgnoreCase(newService.getName())) {
                exist = true;
            }
        }

        if (!exist) {
            services.add(newService);
        }
    }

}
