package com.lzhlyle.demo.design.pattern.gof.observer.before;

import com.lzhlyle.demo.design.pattern.gof.observer.common.Member;
import com.lzhlyle.demo.design.pattern.gof.observer.common.Team;

public class Client {
    public static void main(String[] args) {
        FootballTeam footballTeam = new FootballTeam();
        BasketballTeam basketballTeam = new BasketballTeam();

        Member mem1 = new Student(); // football
        Member mem2 = new Student(); // football, basketball

        // 社团开会时，需要显示告知成员
        footballTeam.meeting();
        mem1.attend(footballTeam.getName());
        mem2.attend(footballTeam.getName());

        basketballTeam.meeting();
        mem2.attend(basketballTeam.getName());
    }
}
