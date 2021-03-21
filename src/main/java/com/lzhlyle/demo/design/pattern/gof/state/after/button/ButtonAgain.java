package com.lzhlyle.demo.design.pattern.gof.state.after.button;

import com.lzhlyle.demo.design.pattern.gof.state.after.state.IOrderState;

public class ButtonAgain implements IButton {
    @Override
    public String name() {
        return "再来一单";
    }

    @Override
    public IOrderState click(IOrderState currState) {
        return currState;
    }
}
