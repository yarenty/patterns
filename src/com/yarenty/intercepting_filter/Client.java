package com.yarenty.intercepting_filter;

/**
 * Created by yarenty on 19/02/2015.
 */
public class Client {

    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }
}
