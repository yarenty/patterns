package com.yarenty.template;

/**
 * Created by yarenty on 16/02/2015.
 */
public class Football extends Game {

    @Override
    void endPlay() {
        System.out.println("Football game finished.");
    }


    @Override
    void initialize() {
        System.out.println("Football initialized");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game started");
    }
}
