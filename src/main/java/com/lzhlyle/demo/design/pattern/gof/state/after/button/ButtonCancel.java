package com.lzhlyle.demo.design.pattern.gof.state.after.button;

import com.lzhlyle.demo.design.pattern.gof.state.after.state.IOrderState;
import com.lzhlyle.demo.design.pattern.gof.state.after.state.OrderStateCancel;

public class ButtonCancel implements IButton {
    @Override
    public String name() {
        return "取消";
    }

    @Override
    public IOrderState click(IOrderState currState) {
        return new OrderStateCancel();
    }
}
