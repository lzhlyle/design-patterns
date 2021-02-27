package com.lzhlyle.demo.design.pattern.gof.builder.after;

import com.lzhlyle.demo.design.pattern.gof.builder.common.Meal;

// 厨师：建造者，会做许多单品
public class Builder {
    // 一顿饭
    private final Meal meal = new Meal();

    public Meal getMeal() {
        return meal;
    }

    public void makeHamburger() {
        meal.add("Hamburger");
    }

    public void makeCoke() {
        meal.add("Coke");
    }

    public void makeWine() {
        meal.add("Wine");
    }

    public void makeChicken() {
        meal.add("Chicken");
    }

    public void makeBeef() {
        meal.add("Beef");
    }

    public void makeLamb() {
        meal.add("Lamb");
    }

    public void makeVegetables() {
        meal.add("Vegetables");
    }
}
