package com.lzhlyle.demo.design.pattern.gof.state.after;

import com.lzhlyle.demo.design.pattern.gof.state.common.IOrder;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        // 消费方无差异
        // 对于「有哪些订单状态」、「每个状态可支持的按钮操作」的扩展，更开放
        IOrder order = new OrderImpl();
        String[] buttons = order.getButtons();
        System.out.println(order.getState() + "," + Arrays.toString(buttons));

        boolean clickRes = order.click(buttons[0]);
        if (!clickRes) System.out.println("click fail");
        System.out.println(order.getState());
    }
}
