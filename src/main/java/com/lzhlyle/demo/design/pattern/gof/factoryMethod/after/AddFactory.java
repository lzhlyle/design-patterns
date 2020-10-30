package com.lzhlyle.demo.design.pattern.gof.factoryMethod.after;

import com.lzhlyle.demo.design.pattern.gof.strategy.common.IOperate;
import com.lzhlyle.demo.design.pattern.gof.strategy.common.OperationAdd;

public class AddFactory implements IFactory {
    public IOperate createOperation() {
        return new OperationAdd();
    }
}
