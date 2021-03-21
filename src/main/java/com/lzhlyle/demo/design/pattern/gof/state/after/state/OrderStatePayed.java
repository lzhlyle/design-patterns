package com.lzhlyle.demo.design.pattern.gof.state.after.state;

import com.lzhlyle.demo.design.pattern.gof.state.after.button.ButtonContinue;
import com.lzhlyle.demo.design.pattern.gof.state.after.button.ButtonLogistics;
import com.lzhlyle.demo.design.pattern.gof.state.after.button.IButton;

public class OrderStatePayed implements IOrderState {
    private static final IButton[] buttons = new IButton[]{new ButtonContinue(), new ButtonLogistics()};

    @Override
    public String name() {
        return "已支付";
    }

    @Override
    public IButton[] buttons() {
        return buttons;
    }
}
