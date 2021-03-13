package com.lzhlyle.demo.design.pattern.gof.observer.common;

public interface Member {
    default void attend(String teamName) {
        System.out.println("attend " + teamName);
    }
}
