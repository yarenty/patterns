package com.yarenty.template;

/**
 * Created by yarenty on 16/02/2015.
 */
public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    //template method
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }

}
