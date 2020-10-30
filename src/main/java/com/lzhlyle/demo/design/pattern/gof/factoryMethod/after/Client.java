package com.lzhlyle.demo.design.pattern.gof.factoryMethod.after;

import com.lzhlyle.demo.design.pattern.gof.strategy.common.IOperate;

public class Client {
    public static void main(String[] args) {
        // 相对与 simple factory 的 IOperate operateAdd = new OperationAdd();
        // 工厂方法模式 将变化从「创建什么具体类」转移到「创建什么工厂」
        // 往后的优化就是针对工厂，而非操作类 IOperate
        IFactory factory = new AddFactory();

        // 以下代码无需改动
        IOperate operate = factory.createOperation();
        int res = operate.oper(4, 8);
        System.out.println(res);
    }
}
