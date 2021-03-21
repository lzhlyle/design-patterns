package com.lzhlyle.demo.design.pattern.gof.state.common;

import java.util.Date;

public class TimeoutConfigSingleton {
    private static final TimeoutConfigSingleton instance = new TimeoutConfigSingleton();

    private TimeoutConfigSingleton() {
    }

    public static TimeoutConfigSingleton createInstance() {
        return instance;
    }

    public boolean timeout(Date createTime) {
        return false;
    }
}
