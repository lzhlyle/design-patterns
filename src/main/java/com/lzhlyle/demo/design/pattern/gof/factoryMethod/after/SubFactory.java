package com.lzhlyle.demo.design.pattern.gof.factoryMethod.after;

import com.lzhlyle.demo.design.pattern.gof.strategy.common.IOperate;
import com.lzhlyle.demo.design.pattern.gof.strategy.common.OperationSub;

public class SubFactory implements IFactory {
    public IOperate createOperation() {
        return new OperationSub();
    }
}
