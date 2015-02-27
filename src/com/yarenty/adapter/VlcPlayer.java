package com.yarenty.adapter;

/**
 * Created by yarenty on 02/02/15.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(final String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(final String fileName) {
        //do nothing
    }
}
