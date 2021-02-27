package com.lzhlyle.demo.design.pattern.gof.builder.after;

import com.lzhlyle.demo.design.pattern.gof.builder.common.Meal;

public class Client {
    public static void main(String[] args) {
        // 行政总厨
        Director director = new Director();

        {
            // 厨师1
            Builder b1 = new Builder();
            // 行政总厨 指挥 厨师1 如何做情侣套餐
            director.offerCouple(b1);
            Meal meal = b1.getMeal();
            meal.show();
        }

        {
            // 厨师2
            Builder b2 = new Builder();
            // 行政总厨 指挥 厨师2 如何做运动套餐
            director.offerSport(b2);
            Meal meal = b2.getMeal();
            meal.show();
        }

        {
            // 厨师3
            Builder b3 = new Builder();
            // 行政总厨 指挥 厨师3 如何做大胃王套餐
            director.offerBig(b3);
            Meal meal = b3.getMeal();
            meal.show();
        }


        // 将如何搭配的思考，从 Builder 中独立出来，由 Director 负责，类比产品经理
        // Builder 专心于如何做得好吃，类比开发工程师
    }
}
