package com.lzhlyle.demo.design.pattern.gof.facade.after;

public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.updateParamAndNotice();

        facade.saveFromRpc();

        // 提供更易理解的高层入口 Facade，意图更明确，使子系统更易使用
    }
}
