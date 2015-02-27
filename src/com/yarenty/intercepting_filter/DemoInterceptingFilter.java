package com.yarenty.intercepting_filter;

/**
 * Created by yarenty on 19/02/2015.
 */
public class DemoInterceptingFilter {

    public static void main(final String[] args) {

        System.out.println("\n\n ***INTERCEPTING FILTER PATTERN***\n The intercepting filter design pattern is used" +
                " when we want to do some pre-processing/post-processing with request or response of the application." +
                " Filters are defined and applied on the request before passing the request to actual target " +
                " application. Filters can do the authentication/ authorization/ logging or tracing of request" +
                " and  then pass the requests to corresponding handlers. Following are the entities of this type" +
                " design pattern:\n" +
                " > FILTER - which will perform certain task prior or after execution of request by request handler.\n" +
                " > FILTER CHAIN - carries multiple filters and help to execute them in defined order on target.\n" +
                " > TARGET - the request handler/\n" +
                " > FILTER MANAGER - manages the filters ano filter chain.\n" +
                " > CLIENT - is the object who sends request to the target object.\n " +
                " \n\n");

        final FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        final Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }

}
