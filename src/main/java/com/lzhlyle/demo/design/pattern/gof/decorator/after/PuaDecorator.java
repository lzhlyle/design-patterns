package com.lzhlyle.demo.design.pattern.gof.decorator.after;

public class PuaDecorator extends AbstractGreetingDecorator {
    public void sayHello() {
        if (person != null) {
            person.sayHello();
        }
        System.out.println("You are a dreamboat!");
    }
}
