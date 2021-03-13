package com.lzhlyle.demo.design.pattern.gof.observer.before;

import com.lzhlyle.demo.design.pattern.gof.observer.common.Team;

public class BasketballTeam implements Team {
    @Override
    public String getName() {
        return "basketball team";
    }

    @Override
    public void meeting() {
        System.out.println("basketball team meeting");
    }
}
