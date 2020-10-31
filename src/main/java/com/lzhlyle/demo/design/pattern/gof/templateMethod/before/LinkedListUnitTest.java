package com.lzhlyle.demo.design.pattern.gof.templateMethod.before;

import com.lzhlyle.demo.design.pattern.gof.templateMethod.common.Alg;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LinkedListUnitTest {
    private int max, size;

    @Before
    public void setUp() {
        max = 100;
        size = 10;
    }

    @Test
    public void sortTest() {
        List<Integer> list = new LinkedList<>();
        Random rd = new Random();
        for (int i = 0; i < size; i++) {
            list.add(rd.nextInt(max));
        }

        Alg alg = new Alg();
        alg.sort(list);
        System.out.println(list);
    }
}
