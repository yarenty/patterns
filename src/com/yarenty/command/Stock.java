package com.yarenty.command;

/**
 * Created by yarenty on 10/02/2015.
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println(" Stock [Name: "+name+"; quantity:"+quantity+"] bought");
    }

    public void sell() {
        System.out.println(" Stock [Name: "+ name + "; quantity:"+quantity+"] sold");
    }
}
