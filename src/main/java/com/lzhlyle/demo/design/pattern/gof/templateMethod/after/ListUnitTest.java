package com.lzhlyle.demo.design.pattern.gof.templateMethod.after;

import com.lzhlyle.demo.design.pattern.gof.templateMethod.common.Alg;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Random;

public abstract class ListUnitTest {
    // 父类定义主要的执行流程

    private int max, size;
    private Random rd;

    @Before
    public void setUp() {
        max = getMax();
        size = getSize();
        rd = new Random();
    }

    @Test
    public void sortTest() {
        List<Integer> list = initList();
        fillList(list);

        Alg alg = new Alg();
        alg.sort(list);
        System.out.println(list);
    }

    // 预留出方法的模板，由子类选择实现
    protected void fillList(List<Integer> list) {
        for (int i = 0; i < size; i++) {
            list.add(rd.nextInt(max));
        }
    }

    protected abstract List<Integer> initList();

    protected int getMax() {
        return 100;
    }

    protected int getSize() {
        return 10;
    }
}
