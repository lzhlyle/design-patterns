package com.lzhlyle.demo.design.pattern.gof.prototype.before;

public class Client {
    public static void main(String[] args) {
        // 打造机器人
        Robot manager = new Robot(0, "admin", null);

        // 造其他机器人
        Robot staff001 = new Robot(1, "admin", manager);
        Robot staff002 = new Robot(2, "admin", manager);
        Robot staff003 = new Robot(3, "admin", manager);
        Robot staff004 = new Robot(4, "admin", manager);
        Robot staff005 = new Robot(5, "admin", manager);

        // 在实例化 staff 机器人的时候，大多信息是不变的，只是少量信息在变化，
        // 可考虑原型模式
    }
}
