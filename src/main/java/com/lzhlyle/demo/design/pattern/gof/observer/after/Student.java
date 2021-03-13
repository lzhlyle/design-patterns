package com.lzhlyle.demo.design.pattern.gof.observer.after;

import com.lzhlyle.demo.design.pattern.gof.observer.common.Member;

public class Student implements Member {
    Student join(AbstractTeam team) {
        team.join(this);
        return this;
    }
}
