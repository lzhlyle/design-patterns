package com.lzhlyle.demo.design.pattern.gof.strategy.after;

public class Client {
    public static void main(String[] args) {
        StrategyContext context = new StrategyContext();
        int res = context.getResult(1, 2);
        System.out.println(res);

        // 相对 Client，整个 context 内部封装了「算法家族」，
        // 内部自行绝决定替换，外部无感知

        // 相对 simple factory，
        // 只是将选择放在了 context 内部，仍然由需要指定之处
    }
}
