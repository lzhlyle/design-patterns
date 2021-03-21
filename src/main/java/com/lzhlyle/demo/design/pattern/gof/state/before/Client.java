package com.lzhlyle.demo.design.pattern.gof.state.before;

import com.lzhlyle.demo.design.pattern.gof.state.common.IOrder;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        IOrder order = new OrderImpl();
        String[] buttons = order.getButtons();
        System.out.println(order.getState() + "," + Arrays.toString(buttons));

        boolean clickRes = order.click(buttons[0]);
        if (!clickRes) System.out.println("click fail");
        System.out.println(order.getState());
    }
}
