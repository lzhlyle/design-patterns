package com.lzhlyle.demo.design.pattern.gof.prototype.after;

public class Client {
    public static void main(String[] args) {
        // 打造机器人
        RobotPrototype manager = new RobotPrototype(0, "admin", null);

        // 造其他机器人
        RobotPrototype staff001 = new RobotPrototype(1, "admin", manager);
        RobotPrototype staff002 = staff001.cloneOne(2);
        RobotPrototype staff003 = staff001.cloneOne(3);
        RobotPrototype staff004 = staff001.cloneOne(4);
        RobotPrototype staff005 = staff001.cloneOne(5);

        // 当初始化的信息较复杂、涉及更多计算/资源获取/读取 DB 信息等耗时操作时，
        // 原型模式可以更快创建
    }
}
