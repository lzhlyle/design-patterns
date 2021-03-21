package com.lzhlyle.demo.design.pattern.gof.state.after.button;

import com.lzhlyle.demo.design.pattern.gof.state.after.state.IOrderState;

public interface IButton {
    String name();

    IOrderState click(IOrderState currState);
}
