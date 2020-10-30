package com.lzhlyle.demo.design.pattern.gof.proxy.before;

import com.lzhlyle.demo.design.pattern.gof.proxy.common.ConcreteClient;
import com.lzhlyle.demo.design.pattern.gof.proxy.common.IClientRequest;

public class Client {
    public static void main(String[] args) {
        IClientRequest client = new ConcreteClient();
        client.request();

        // 新需求：希望隐藏 ConcreteClient，不希望被直接调用
        // 同时希望做一些类似 AOP 的处理（统计、安全等）
    }
}
