package com.lzhlyle.demo.design.pattern.gof.observer.after;

import com.lzhlyle.demo.design.pattern.gof.observer.common.Team;

public class BasketballTeam extends AbstractTeam {
    @Override
    public String getName() {
        return "basketball team";
    }

    @Override
    public void meeting() {
        System.out.println("basketball team meeting");
        super.meeting();
    }
}
