package com.lzhlyle.demo.design.pattern.gof.prototype.before;

public class Robot {
    // 流水号
    private Integer sn;

    // 管理密码
    private String password;

    // 上级管理者
    private Robot manager;

    public Robot(Integer sn, String password, Robot manager) {
        this.sn = sn;
        this.password = password;
        this.manager = manager;
    }
}
