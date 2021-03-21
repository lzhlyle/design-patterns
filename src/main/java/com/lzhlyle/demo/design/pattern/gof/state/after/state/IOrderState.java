package com.lzhlyle.demo.design.pattern.gof.state.after.state;

import com.lzhlyle.demo.design.pattern.gof.state.after.button.IButton;

public interface IOrderState {
    String name();

    IButton[] buttons();

    default IOrderState click(String button) {
        for (IButton btn : buttons())
            if (btn.name().equals(button))
                return btn.click(this);
        return null;
    }
}
