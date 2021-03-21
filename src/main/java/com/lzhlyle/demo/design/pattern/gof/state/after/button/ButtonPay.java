package com.lzhlyle.demo.design.pattern.gof.state.after.button;

import com.lzhlyle.demo.design.pattern.gof.state.after.state.IOrderState;
import com.lzhlyle.demo.design.pattern.gof.state.after.state.OrderStatePayed;

public class ButtonPay implements IButton {
    @Override
    public String name() {
        return "支付";
    }

    @Override
    public IOrderState click(IOrderState currState) {
        return new OrderStatePayed();
    }
}
