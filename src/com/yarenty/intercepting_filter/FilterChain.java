package com.yarenty.intercepting_filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yarenty on 18/02/2015.
 */
public class FilterChain {

    private final List<Filter> filters = new ArrayList<Filter>();
    private Target target;

    public void addFilter(final Filter filter) {
        filters.add(filter);
    }

    public void execute(final String request) {
        for (final Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(final Target target) {
        this.target = target;
    }

}
