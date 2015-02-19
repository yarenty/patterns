package com.yarenty.intercepting_filter;

/**
 * Created by yarenty on 18/02/2015.
 */
public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target) {
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }


    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request) {
        filterChain.execute(request);
    }
}
