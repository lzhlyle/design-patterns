package com.lzhlyle.demo.design.pattern.gof.proxy.after;

import com.lzhlyle.demo.design.pattern.gof.proxy.common.ConcreteClient;
import com.lzhlyle.demo.design.pattern.gof.proxy.common.IClientRequest;

public class Proxy implements IClientRequest {
    private final IClientRequest client = new ConcreteClient();

    public void request() {
        beforeRequest();
        client.request();
        afterRequest();
    }

    // 可结合模板方法模式，将能力下沉，形成代理框架
    private void afterRequest() {
        System.out.println("After request.");
    }

    private void beforeRequest() {
        System.out.println("Before request.");
    }
}
