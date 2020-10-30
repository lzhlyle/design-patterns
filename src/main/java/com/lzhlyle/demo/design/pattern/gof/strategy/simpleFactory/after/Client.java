package com.lzhlyle.demo.design.pattern.gof.strategy.simpleFactory.after;

import com.lzhlyle.demo.design.pattern.gof.strategy.common.IOperate;

public class Client {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        IOperate operateAdd = factory.createOperation(SimpleFactory.OPER_MODE_ADD);
        int resAdd = operateAdd.oper(1, 2);
        System.out.println(resAdd);

        IOperate operateSub = factory.createOperation(SimpleFactory.OPER_MODE_SUB);
        int resSub = operateSub.oper(3, 5);
        System.out.println(resSub);

        // 当需要将 OperationAdd 替换为 OperationSub 时，
        // 只需替换 factory.createOperation() 的传参
        // 可进一步通过读取配置文件的方式，避免代码改动，遵循 OCP
    }
}
