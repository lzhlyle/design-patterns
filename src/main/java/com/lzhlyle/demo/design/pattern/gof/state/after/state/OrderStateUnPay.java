package com.lzhlyle.demo.design.pattern.gof.state.after.state;

import com.lzhlyle.demo.design.pattern.gof.state.after.button.ButtonCancel;
import com.lzhlyle.demo.design.pattern.gof.state.after.button.ButtonContinue;
import com.lzhlyle.demo.design.pattern.gof.state.after.button.ButtonPay;
import com.lzhlyle.demo.design.pattern.gof.state.after.button.IButton;

public class OrderStateUnPay implements IOrderState {
    private static final IButton[] buttons = new IButton[]{new ButtonPay(), new ButtonCancel(), new ButtonContinue()};

    @Override
    public String name() {
        return "未支付";
    }

    @Override
    public IButton[] buttons() {
        return buttons;
    }
}
