package com.lzhlyle.demo.design.pattern.gof.state.after.state;

import com.lzhlyle.demo.design.pattern.gof.state.after.button.ButtonContinue;
import com.lzhlyle.demo.design.pattern.gof.state.after.button.IButton;

public class OrderStateCancel implements IOrderState {
    private static final IButton[] buttons = new IButton[]{new ButtonContinue()};

    @Override
    public String name() {
        return "已取消";
    }

    @Override
    public IButton[] buttons() {
        return buttons;
    }
}
