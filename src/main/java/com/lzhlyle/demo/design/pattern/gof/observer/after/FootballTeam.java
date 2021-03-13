package com.lzhlyle.demo.design.pattern.gof.observer.after;

import com.lzhlyle.demo.design.pattern.gof.observer.common.Team;

public class FootballTeam extends AbstractTeam {
    @Override
    public String getName() {
        return "football team";
    }

    @Override
    public void meeting() {
        System.out.println("football team meeting");
        super.meeting();
    }
}
