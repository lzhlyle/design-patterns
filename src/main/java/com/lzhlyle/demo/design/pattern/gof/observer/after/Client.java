package com.lzhlyle.demo.design.pattern.gof.observer.after;

import com.lzhlyle.demo.design.pattern.gof.observer.common.Member;

public class Client {
    public static void main(String[] args) {
        FootballTeam footballTeam = new FootballTeam();
        BasketballTeam basketballTeam = new BasketballTeam();

        // 入团即订阅
        Member mem1 = new Student().join(footballTeam); // football
        Member mem2 = new Student().join(footballTeam).join(basketballTeam); // football, basketball

        // 开会时，由内部自动通知所有成员
        footballTeam.meeting();
        basketballTeam.meeting();
    }
}
