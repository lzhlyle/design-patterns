package com.lzhlyle.demo.design.pattern.gof.proxy.common;

public class ConcreteClient implements IClientRequest {
    public void request() {
        System.out.println("Sending request...");
    }
}
