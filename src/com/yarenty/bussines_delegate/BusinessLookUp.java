package com.yarenty.bussines_delegate;

/**
 * Created by yarenty on 18/02/2015.
 */
public class BusinessLookUp {

    public BusinessService getBusinessService(final String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        }
        return new JMSService();
    }

}
