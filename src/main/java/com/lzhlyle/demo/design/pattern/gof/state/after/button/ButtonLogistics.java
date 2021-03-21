package com.lzhlyle.demo.design.pattern.gof.state.after.button;

import com.lzhlyle.demo.design.pattern.gof.state.after.state.IOrderState;

public class ButtonLogistics implements IButton {
    @Override
    public String name() {
        return "查看物流";
    }

    @Override
    public IOrderState click(IOrderState currState) {
        return currState;
    }
}
