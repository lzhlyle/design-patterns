package com.lzhlyle.demo.design.pattern.gof.state.after;

import com.lzhlyle.demo.design.pattern.gof.state.after.button.IButton;
import com.lzhlyle.demo.design.pattern.gof.state.after.state.IOrderState;
import com.lzhlyle.demo.design.pattern.gof.state.after.state.OrderStateUnPay;
import com.lzhlyle.demo.design.pattern.gof.state.common.IOrder;

public class OrderImpl implements IOrder {
    // 抽象出「订单状态」，增加订单状态不影响此类
    private IOrderState orderState;

    public OrderImpl() {
        orderState = new OrderStateUnPay();
    }

    @Override
    public String getState() {
        return orderState.name();
    }

    @Override
    public String[] getButtons() {
        // 抽象出「按钮」，增加按钮操作不影响此类
        IButton[] buttons = orderState.buttons();

        String[] res = new String[buttons.length];
        for (int i = 0; i < buttons.length; i++)
            res[i] = buttons[i].name();
        return res;
    }

    @Override
    public boolean click(String button) {
        IOrderState nextState = orderState.click(button);
        if (nextState == null) return false;

        if (nextState != orderState) changeState(nextState);
        return true;
    }

    private void changeState(IOrderState to) {
        orderState = to;
    }
}
