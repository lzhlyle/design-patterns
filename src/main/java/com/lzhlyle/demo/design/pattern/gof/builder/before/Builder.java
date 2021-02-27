package com.lzhlyle.demo.design.pattern.gof.builder.before;

import com.lzhlyle.demo.design.pattern.gof.builder.common.Meal;

// 厨师：会做许多单品，还要思考如何做成品
public class Builder {
    // 一顿饭
    private final Meal meal = new Meal();

    public Meal getMeal() {
        return meal;
    }

    // 情侣套餐
    public void offerCouple() {
        makeLamb();
        makeVegetables();
        makeWine();
    }

    // 运动套餐
    public void offerSport() {
        makeBeef();
        makeVegetables();
        makeCoke();
    }

    // 大胃王套餐
    public void offerBig() {
        makeHamburger();
        makeCoke();
        makeChicken();
        makeCoke();
        makeVegetables();
    }

    private void makeHamburger() {
        meal.add("Hamburger");
    }

    private void makeCoke() {
        meal.add("Coke");
    }

    private void makeWine() {
        meal.add("Wine");
    }

    private void makeChicken() {
        meal.add("Chicken");
    }

    private void makeBeef() {
        meal.add("Beef");
    }

    private void makeLamb() {
        meal.add("Lamb");
    }

    private void makeVegetables() {
        meal.add("Vegetables");
    }
}
