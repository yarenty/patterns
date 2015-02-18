package com.yarenty.template;

/**
 * Created by yarenty on 16/02/2015.
 */
public class Cricket extends Game {

    @Override
    void endPlay() {
        System.out.println("Cricket game finished.");
    }


    @Override
    void initialize() {
        System.out.println("Cricket initialized");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game started");
    }
}
