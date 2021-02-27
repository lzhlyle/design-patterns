package com.lzhlyle.demo.design.pattern.gof.prototype.after;

public class RobotPrototype {
    // 流水号
    private Integer sn;

    // 管理密码
    private String password;

    // 上级管理者
    private RobotPrototype manager;

    public RobotPrototype(Integer sn, String password, RobotPrototype manager) {
        this.sn = sn;
        this.password = password;
        this.manager = manager;
    }

    public RobotPrototype cloneOne(Integer sn) {
        // 视业务情况，浅拷贝或深拷贝
        return new RobotPrototype(sn, this.password, this.manager);
    }
}
