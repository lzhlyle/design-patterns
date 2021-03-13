package com.lzhlyle.demo.design.pattern.gof.observer.after;

import com.lzhlyle.demo.design.pattern.gof.observer.common.Member;
import com.lzhlyle.demo.design.pattern.gof.observer.common.Team;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTeam implements Team {
    private List<Member> members;

    public AbstractTeam() {
        members = new ArrayList<>();
    }

    public void join(Member member) {
        members.add(member);
    }

    @Override
    public void meeting() {
        for (Member member : members) {
            member.attend(this.getName());
        }
    }
}
