package com.lzhlyle.demo.design.pattern.gof.decorator.after;

import com.lzhlyle.demo.design.pattern.gof.decorator.common.Person;

// 问候修饰器
public abstract class AbstractGreetingDecorator implements Person {
    protected Person person;

    public void teach(Person person) {
        this.person = person;
    }
}
