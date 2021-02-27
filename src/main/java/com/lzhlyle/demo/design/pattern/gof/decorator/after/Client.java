package com.lzhlyle.demo.design.pattern.gof.decorator.after;

import com.lzhlyle.demo.design.pattern.gof.decorator.common.Man;
import com.lzhlyle.demo.design.pattern.gof.decorator.common.Person;

public class Client {
    public static void main(String[] args) {
        gentlemanGreeting();
        System.out.println("=============");
        gentleAndPuaGreeting();
    }

    private static void gentlemanGreeting() {
        Person gentleman = new Man("Lyle");
        // 无需改变 Man 的既有职责，不会让 Man 更臃肿(世俗)，而是保持初心 SRP

        AbstractGreetingDecorator gentleWay = new GentlemanDecorator();
        gentleWay.teach(gentleman);

        gentleWay.sayHello();
    }

    private static void gentleAndPuaGreeting() {
        Person badBoy = new Man("Lyle");

        // 还可适时地任意搭配顺序
        AbstractGreetingDecorator gentleWay = new GentlemanDecorator();
        gentleWay.teach(badBoy);
        AbstractGreetingDecorator puaWay = new PuaDecorator();
        puaWay.teach(gentleWay);

        puaWay.sayHello();
    }
}
