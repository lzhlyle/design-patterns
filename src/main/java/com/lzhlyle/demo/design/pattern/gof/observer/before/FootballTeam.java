package com.lzhlyle.demo.design.pattern.gof.observer.before;

import com.lzhlyle.demo.design.pattern.gof.observer.common.Team;

public class FootballTeam implements Team {
    @Override
    public String getName() {
        return "football team";
    }

    @Override
    public void meeting() {
        System.out.println("football team meeting");
    }
}
