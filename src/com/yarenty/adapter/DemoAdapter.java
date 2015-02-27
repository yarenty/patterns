package com.yarenty.adapter;

/**
 * Created by yarenty on 02/02/15.
 */
public class DemoAdapter {
    public static void main(final String[] args) {

        System.out.println("\n\n ***ADAPTER PATTERN***\n Adapter pattern works as bridge between two incompatible" +
                " interfaces. This pattern involves a single class which is responsible to join functionalities " +
                " of independent or incompatible interfaces. A real life example could be a case of card reader which" +
                " acts as an adapter between memory card and a laptop. Tou plugin the memory card into card reader" +
                " and card reader into the laptop so that memory card can be read via laptop. \n" +
                " Structural pattern.\n" +
                " \n\n");


        final AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
