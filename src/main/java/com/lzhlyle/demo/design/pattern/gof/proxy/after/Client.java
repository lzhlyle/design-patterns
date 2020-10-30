package com.lzhlyle.demo.design.pattern.gof.proxy.after;

import com.lzhlyle.demo.design.pattern.gof.proxy.common.IClientRequest;

public class Client {
    public static void main(String[] args) {
        IClientRequest client = new Proxy();
        client.request();

        // 包装代理
    }
}
