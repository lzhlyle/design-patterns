package com.lzhlyle.demo.design.pattern.gof.facade.before;

import com.lzhlyle.demo.design.pattern.gof.facade.common.SubSystem;

import java.util.Random;

public class Client {
    public static void main(String[] args) {

        // 现状：子系统/遗留系统因不断演化，越来越复杂臃肿，不敢或不能轻易调整重构
        // 需求：为子系统/遗留系统进行维护、功能扩展

        SubSystem subSystem = new SubSystem();
        Random rd = new Random();

        {
            subSystem.process7();

            if (rd.nextBoolean()) {
                subSystem.process1();
                subSystem.process3();
                subSystem.process5();
            }

            if (rd.nextBoolean()) {
                subSystem.process2();
                subSystem.process4();
                subSystem.process6();
            }
        }

        // 直接调用子系统/遗留系统的服务，代码更难以调试和理解
    }
}
