package com.lzhlyle.demo.design.pattern.gof.facade.after;

import com.lzhlyle.demo.design.pattern.gof.facade.common.SubSystem;

public class Facade {
    private SubSystem subSystem;

    public Facade() {
        this.subSystem = new SubSystem();
    }

    public void processA() {
        subSystem.process7();

        subSystem.process1();
        subSystem.process3();
        subSystem.process5();
    }

    public void processB() {
        subSystem.process7();

        subSystem.process2();
        subSystem.process4();
        subSystem.process6();
    }
}
