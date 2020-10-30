package com.lzhlyle.demo.design.pattern.gof.strategy.after;

import com.lzhlyle.demo.design.pattern.gof.strategy.common.IOperate;
import com.lzhlyle.demo.design.pattern.gof.strategy.common.OperationAdd;
import com.lzhlyle.demo.design.pattern.gof.strategy.common.OperationSub;

import java.util.Random;

public class StrategyContext {
    private IOperate operateStrategy;

    public void setOperateStrategy(IOperate strategy) {
        operateStrategy = strategy;
    }

    public int getResult(int a, int b) {
        if (operateStrategy == null) {
            operateStrategy = getStrategy();
        }
        return operateStrategy.oper(a, b);
    }

    private IOperate getStrategy() {
        // 内部替换逻辑
        Random rd = new Random();
        if (rd.nextBoolean()) {
            return new OperationAdd();
        }
        return new OperationSub();
    }
}
