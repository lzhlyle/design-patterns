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

        AbstractGreetingDecorator gentle = new GentlemanDecorator();
        gentle.setPerson(gentleman);

        gentle.sayHello();
    }

    private static void gentleAndPuaGreeting() {
        Person badboy = new Man("Lyle");

        // 还可适时地任意搭配顺序
        AbstractGreetingDecorator gentle = new GentlemanDecorator();
        gentle.setPerson(badboy);
        AbstractGreetingDecorator pua = new PuaDecorator();
        pua.setPerson(gentle);

        pua.sayHello();
    }
}
