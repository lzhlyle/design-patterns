package com.lzhlyle.demo.design.pattern.gof.templateMethod.after;

import java.util.LinkedList;
import java.util.List;

public class LinkedListUnitTest extends ListUnitTest {
    @Override
    protected List<Integer> initList() {
        return new LinkedList<>();
    }

    // 子类自定义重写

    @Override
    protected int getMax() {
        return 1000;
    }

    @Override
    protected int getSize() {
        return 20;
    }
}
