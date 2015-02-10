package com.yarenty.command;

/**
 * Created by yarenty on 10/02/2015.
 */
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock absStock) {
        this.abcStock = absStock;
    }


    @Override
    public void execute() {
        abcStock.sell();
    }
}
