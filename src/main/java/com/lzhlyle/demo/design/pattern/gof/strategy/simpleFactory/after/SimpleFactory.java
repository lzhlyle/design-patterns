package com.lzhlyle.demo.design.pattern.gof.strategy.simpleFactory.after;

import com.lzhlyle.demo.design.pattern.gof.strategy.common.IOperate;
import com.lzhlyle.demo.design.pattern.gof.strategy.common.OperationAdd;
import com.lzhlyle.demo.design.pattern.gof.strategy.common.OperationSub;

public class SimpleFactory {
    public static final int OPER_MODE_ADD = 1;
    public static final int OPER_MODE_SUB = 2;

    public IOperate createOperation(int type) {
        if (type == OPER_MODE_ADD) {
            return new OperationAdd();
        } else if (type == OPER_MODE_SUB) {
            return new OperationSub();
        }
        throw new IllegalArgumentException();
    }

    // 可使用单例模式来实例化 SimpleFactory
    // 可考虑传入 Enum 类型的参数 type
}
