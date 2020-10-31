package com.lzhlyle.demo.design.pattern.gof.templateMethod.common;

import java.util.Collections;
import java.util.List;

public class Alg {
    public void sort(List<Integer> list) {
        Collections.sort(list);
    }

    // 需求：通过 List 的不同实现，分别对算法进行测试
}
