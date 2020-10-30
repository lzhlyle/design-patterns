package com.lzhlyle.demo.design.pattern.gof.strategy.simpleFactory.before;

import com.lzhlyle.demo.design.pattern.gof.strategy.common.IOperate;
import com.lzhlyle.demo.design.pattern.gof.strategy.common.OperationAdd;
import com.lzhlyle.demo.design.pattern.gof.strategy.common.OperationSub;

public class Client {
    public static void main(String[] args) {
        IOperate operateAdd = new OperationAdd();
        int resAdd = operateAdd.oper(1, 2);
        System.out.println(resAdd);

        IOperate operateSub = new OperationSub();
        int resSub = operateSub.oper(3, 5);
        System.out.println(resSub);

        // 当需要将 OperationAdd 替换为 OperationSub 时，
        // 需要改动代码，违反 OCP
    }
}
