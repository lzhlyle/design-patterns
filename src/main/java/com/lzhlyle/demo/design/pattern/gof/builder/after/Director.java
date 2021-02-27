package com.lzhlyle.demo.design.pattern.gof.builder.after;

// 行政总厨：指挥官，只动口不动手
public class Director {
    // 情侣套餐
    public void offerCouple(Builder builder) {
        builder.makeLamb();
        builder.makeVegetables();
        builder.makeWine();
    }

    // 运动套餐
    public void offerSport(Builder builder) {
        builder.makeBeef();
        builder.makeVegetables();
        builder.makeCoke();
    }

    // 大胃王套餐
    public void offerBig(Builder builder) {
        builder.makeHamburger();
        builder.makeCoke();
        builder.makeChicken();
        builder.makeCoke();
        builder.makeVegetables();
    }
}
