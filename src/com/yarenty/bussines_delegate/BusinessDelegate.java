package com.yarenty.bussines_delegate;

/**
 * Created by yarenty on 18/02/2015.
 */
public class BusinessDelegate {

    private final BusinessLookUp lookupService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(final String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
