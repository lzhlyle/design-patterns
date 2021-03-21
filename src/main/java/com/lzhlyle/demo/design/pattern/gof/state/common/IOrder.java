package com.lzhlyle.demo.design.pattern.gof.state.common;

import java.util.Date;

public interface IOrder {
    String getState();

    String[] getButtons();

    boolean click(String button);
}
