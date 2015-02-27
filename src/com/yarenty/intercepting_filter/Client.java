package com.yarenty.intercepting_filter;

/**
 * Created by yarenty on 19/02/2015.
 */
public class Client {

    FilterManager filterManager;

    public void setFilterManager(final FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(final String request) {
        filterManager.filterRequest(request);
    }
}
