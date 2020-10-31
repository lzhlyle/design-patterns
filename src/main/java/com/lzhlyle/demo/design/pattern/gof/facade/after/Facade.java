package com.lzhlyle.demo.design.pattern.gof.facade.after;

import com.lzhlyle.demo.design.pattern.gof.facade.common.SubSystem;

public class Facade {
    private SubSystem subSystem;

    public Facade() {
        this.subSystem = new SubSystem();
    }

    public void updateParamAndNotice() {
        subSystem.printLog();

        subSystem.getInfo();
        subSystem.changeConfig();
        subSystem.sendMessage();
    }

    public void saveFromRpc() {
        subSystem.printLog();

        subSystem.rpc();
        subSystem.saveDb();
    }
}
