package com.lzhlyle.demo.design.pattern.gof.decorator.after;

// 绅士修饰器
public class GentlemanDecorator extends AbstractGreetingDecorator {
    public void sayHello() {
        System.out.println("Nice to meet you.");
        if (person != null) {
            person.sayHello();
        }
    }
}
