package com.lzhlyle.demo.design.pattern.gof.decorator.common;

public class Man implements Person {
    private String name;

    public Man(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.printf("Im %s.%n", name);
    }
}
