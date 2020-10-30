package com.lzhlyle.demo.design.pattern.gof.proxy.after;

import com.lzhlyle.demo.design.pattern.gof.proxy.common.ConcreteClient;
import com.lzhlyle.demo.design.pattern.gof.proxy.common.IClientRequest;

public class Proxy implements IClientRequest {
    private IClientRequest client = new ConcreteClient();

    public void request() {
        beforeRequest();
        client.request();
        afterRequest();
    }

    private void afterRequest() {
        System.out.println("After request.");
    }

    private void beforeRequest() {
        System.out.println("Before request.");
    }
}
