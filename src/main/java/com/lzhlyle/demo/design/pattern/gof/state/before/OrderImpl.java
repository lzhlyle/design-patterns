package com.lzhlyle.demo.design.pattern.gof.state.before;

import com.lzhlyle.demo.design.pattern.gof.state.common.IOrder;
import com.lzhlyle.demo.design.pattern.gof.state.common.TimeoutConfigSingleton;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class OrderImpl implements IOrder {
    private String state;

    public OrderImpl() {
        state = "未支付";
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public String[] getButtons() {
        // 诸多条件分支
        switch (state) {
            case "未支付":
                return new String[]{"支付", "取消", "继续选购"};
            case "已支付":
                return new String[]{"再来一单", "查看物流"};
            case "已取消":
                return new String[]{"再来一单"};
            default:
                return new String[0];
        }
    }

    @Override
    public boolean click(String button) {
        // 诸多条件分支
        switch (state) {
            case "未支付":
                switch (button) {
                    case "支付":
                        changeState("已支付");
                        return true;
                    case "取消":
                        changeState("已取消");
                        return true;
                    case "继续购物":
                        return true;
                    default:
                        return false;
                }
            case "已支付":
                return button.equals("再来一单") || button.equals("查看物流");
            case "已取消":
                return button.equals("再来一单");
            default:
                return false;
        }
    }

    private void changeState(String to) {
        state = to;
    }
}
