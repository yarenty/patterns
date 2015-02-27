package com.yarenty.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Command invoker
 * Created by yarenty on 10/02/2015.
 */
public class Broker {

    private final List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(final Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (final Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }

}
