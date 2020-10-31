package com.lzhlyle.demo.design.pattern.gof.templateMethod.after;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUnitTest extends ListUnitTest {
    @Override
    protected List<Integer> initList() {
        return new ArrayList<>();
    }

    // getMax(), getSize() 均使用父类默认
}
