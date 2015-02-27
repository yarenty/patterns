package com.yarenty.intercepting_filter;

/**
 * Created by yarenty on 18/02/2015.
 */
public class FilterManager {
    FilterChain filterChain;

    public FilterManager(final Target target) {
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }


    public void setFilter(final Filter filter) {
        filterChain.addFilter(filter);
    }

    public void filterRequest(final String request) {
        filterChain.execute(request);
    }
}
