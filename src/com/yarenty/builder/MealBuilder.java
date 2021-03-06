package com.yarenty.builder;

/**
 * Created by yarenty on 02/02/15.
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        final Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        final Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
