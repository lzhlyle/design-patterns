package com.lzhlyle.demo.design.pattern.gof.factoryMethod.after;

import com.lzhlyle.demo.design.pattern.gof.strategy.common.IOperate;

public interface IFactory {
    IOperate createOperation();
}
