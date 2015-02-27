package com.yarenty.builder;

/**
 * Created by yarenty on 02/02/15.
 */
public class DemoBuilder {

    public static void main(final String[] args) {

        System.out.println("\n\n *** BUILDER PATTERN***\n Builder pattern builds a complex object using simple objects" +
                " and using a step by step approach. A builder class builds the final object step by step. This" +
                " builder is independent of other objects. (@see StepBuilder Pattern for easier approach ;-) ) \n" +
                " Creational pattern.\n" +
                " \n\n");


        final MealBuilder mealBuilder = new MealBuilder();

        final Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        final Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}