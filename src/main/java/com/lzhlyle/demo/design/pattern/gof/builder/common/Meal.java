package com.lzhlyle.demo.design.pattern.gof.builder.common;

import java.util.ArrayList;
import java.util.List;

// 一顿饭
public class Meal {
    private final List<String> list = new ArrayList<>();

    public void add(String food) {
        list.add(food);
    }

    public void show() {
        for (String food : list) {
            System.out.print(food + ", ");
        }
        System.out.println();
    }
}
