package com.lzhlyle.demo.design.pattern.gof.facade.common;

public class SubSystem {
    // 子系统调用复杂

    public void getInfo() {
        System.out.println("get info...");
    }

    public void rpc() {
        getInfo();
        System.out.println("rpc...");
    }

    public void changeConfig() {
        System.out.println("change parameter...");
        saveDb();
    }

    public void saveDb() {
        System.out.println("save db...");
    }

    public void sendMessage() {
        System.out.println("send message...");
    }

    public void printLog() {
        System.out.println("print log...");
    }
}
