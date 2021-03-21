package com.lzhlyle.demo.design.pattern.gof.state.after.button;

import com.lzhlyle.demo.design.pattern.gof.state.after.state.IOrderState;

public class ButtonContinue implements IButton {
    @Override
    public String name() {
        return "继续购物";
    }

    @Override
    public IOrderState click(IOrderState currState) {
        return currState;
    }
}
