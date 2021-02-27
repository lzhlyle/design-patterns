package com.lzhlyle.demo.design.pattern.gof.builder.before;

import com.lzhlyle.demo.design.pattern.gof.builder.common.Meal;

public class Client {
    public static void main(String[] args) {

        {
            // 厨师1
            Builder b1 = new Builder();
            // 行政总厨 指挥 厨师1 如何做情侣套餐
            b1.offerCouple();
            Meal meal = b1.getMeal();
            meal.show();
        }

        {
            // 厨师2
            Builder b2 = new Builder();
            // 行政总厨 指挥 厨师2 如何做运动套餐
            b2.offerSport();
            Meal meal = b2.getMeal();
            meal.show();
        }

        {
            // 厨师3
            Builder b3 = new Builder();
            // 行政总厨 指挥 厨师3 如何做大胃王套餐
            b3.offerBig();
            Meal meal = b3.getMeal();
            meal.show();
        }

        // 厨师不仅负责做，还要负责想怎么做
    }
}
