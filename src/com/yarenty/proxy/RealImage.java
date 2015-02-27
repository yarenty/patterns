package com.yarenty.proxy;

/**
 * Created by yarenty on 03/02/15.
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(final String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying::" + fileName);
    }


    private void loadFromDisk(final String fileName) {
        System.out.println("Loading::" + fileName);
    }
}
