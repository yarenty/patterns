package com.yarenty.builder;

/**
 * Created by yarenty on 02/02/15.
 */

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private final List<Item> items = new ArrayList<Item>();

    public void addItem(final Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;

        for (final Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {

        for (final Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
