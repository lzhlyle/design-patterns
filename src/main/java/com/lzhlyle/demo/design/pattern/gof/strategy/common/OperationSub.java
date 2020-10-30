package com.lzhlyle.demo.design.pattern.gof.strategy.common;

public class OperationSub implements IOperate {
    public int oper(int a, int b) {
        return a - b;
    }
}
