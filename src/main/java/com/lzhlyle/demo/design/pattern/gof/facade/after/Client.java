package com.lzhlyle.demo.design.pattern.gof.facade.after;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        Random rd = new Random();
        if (rd.nextBoolean()) {
            facade.processA();
        } else {
            facade.processB();
        }

        // 提供更易理解的高层入口 Facade，使子系统更易使用
    }
}
